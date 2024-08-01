package MultiThreading.Part2;

public class SharedResource {
    boolean isItemAvailable=false;
    public synchronized void  addItem() {
        isItemAvailable=true;
        System.out.println("Item Produced and Waiting For Consumer to Consume..");
        notifyAll();
    }
    public synchronized void consumeItem()  {
        while (!isItemAvailable) {
            try {
                wait();
                System.out.println("Consumer Thread is Waiting..");
            }
            catch (Exception e) {
                //Exception Here.
            }
        }
        isItemAvailable=false;
        System.out.println("Item Consumed Successful..");

    }
}
