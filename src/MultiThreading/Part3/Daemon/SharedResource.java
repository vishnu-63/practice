package MultiThreading.Part3.Daemon;

public class SharedResource {
    boolean isAvailable=false;
    public synchronized void produce(){
        System.out.println("Lock Acquired..");
        isAvailable =true;
        try {
            Thread.sleep(8000);
        }
        catch (Exception e) {

        }
        System.out.println("Lock Released..");
    }
}

