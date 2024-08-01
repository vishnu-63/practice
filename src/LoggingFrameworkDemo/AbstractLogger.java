package LoggingFrameworkDemo;

public abstract class AbstractLogger {
    int level;
    AbstractLogger nextLoggingLevel;
    void setLoggingLevelLogger(AbstractLogger loggingLevel) {
        this.nextLoggingLevel=loggingLevel;
    }
    void logmessage(int level, String msg,LogSubject logSubject){
        if(this.level==level) {
            display(msg,logSubject);
        }
        if(nextLoggingLevel!=null) {
            nextLoggingLevel.logmessage(level,msg,logSubject);
        }
    }

    protected abstract void display(String msg,LogSubject logSubject);

}
