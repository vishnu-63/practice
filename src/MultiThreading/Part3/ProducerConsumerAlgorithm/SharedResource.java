package MultiThreading.Part3.ProducerConsumerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private int bufferSize;
    private Queue<Integer> buffer;
    public SharedResource(int bufferSize) {
        this.bufferSize=bufferSize;
        this.buffer=new LinkedList<>();
    }

    public synchronized void produceItem(int item) throws Exception {
        while (buffer.size()==this.bufferSize) {
            System.out.println("Buffer Is full Waiting For Free Space..");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced Item :"+item);
        notify();

    }

    public synchronized int consumeItem() throws Exception {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is Empty..");
            wait();
        }
        int item=buffer.poll();
        System.out.println("Consumed Item.."+item);
        notify();
        return item;

    }


}
