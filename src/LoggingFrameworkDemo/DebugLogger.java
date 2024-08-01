package LoggingFrameworkDemo;

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level=level;
    }

    @Override
    protected void display(String msg, LogSubject logSubject) {
        String message="DEBUG: "+msg;
        logSubject.notifyAllObeservers(3,message);
    }
}
