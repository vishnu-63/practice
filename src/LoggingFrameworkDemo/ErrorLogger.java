package LoggingFrameworkDemo;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level=level;
    }


    @Override
    protected void display(String msg,LogSubject logSubject) {
        String message="Error: "+msg;
        logSubject.notifyAllObeservers(2,message);
    }
}
