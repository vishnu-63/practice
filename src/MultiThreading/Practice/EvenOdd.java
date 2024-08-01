package MultiThreading.Practice;

public class EvenOdd {
    private boolean isodd = false;
    private int count = 0;
    private int n;

    EvenOdd(int num) {
        this.n = num;
    }


    public synchronized void printOdd() {
        while (count < n) {
            while (!isodd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(count);
            isodd = false;
            count++;
            notify();

        }

    }

    public synchronized void printEven() {
        while (count < n) {
            while (isodd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(count);
            isodd = true;
            count++;
            notify();
        }
    }
}