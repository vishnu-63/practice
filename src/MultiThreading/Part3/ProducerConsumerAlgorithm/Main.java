package MultiThreading.Part3.ProducerConsumerAlgorithm;

import MultiThreading.Part3.ProducerConsumerAlgorithm.SharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource(3);
        Thread producer=new Thread(()->
        {
            try {
            for (int i=1;i<=6;i++) {
                    sharedResource.produceItem(i);
                }
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        Thread consumer=new Thread(()->{

        try {
            for(int i=1;i<=6;i++) {
                sharedResource.consumeItem();
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        });
        producer.start();
        consumer.start();
    }
}
