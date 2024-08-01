package MultiThreading.Practice;

public class EvenOddMain {
    public static void main(String[] args) {
        EvenOdd evenOdd=new EvenOdd(20);
        Thread t1=new Thread(()->{
            evenOdd.printEven();
        });
        Thread t2=new Thread(()->{

            evenOdd.printOdd();
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
