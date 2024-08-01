package LoggingFrameworkDemo;

public class InfoLogger extends AbstractLogger{
    public InfoLogger(int level) {
        this.level=level;
    }

    @Override
    protected void display(String msg, LogSubject logSubject) {
        String message="INFO: "+msg;
        logSubject.notifyAllObeservers(1,message);
    }
}
