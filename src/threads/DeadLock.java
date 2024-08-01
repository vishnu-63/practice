package threads;

public class DeadLock {
    public static void main(String[] args) {
        System.out.println("MAin Thread..");
        String lock1="vishnu";
        String lock2="vardhan";
        Thread t1=new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            synchronized (lock2) {
                System.out.println("Lock Acquired");
            }

            }
        },
                "thread1");

        Thread t2=new Thread(()-> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            synchronized (lock1) {
                System.out.println("Lock Acquired");
            }
        }
        },
                "thread1");

        t1.start();
        t2.start();

    }
}
