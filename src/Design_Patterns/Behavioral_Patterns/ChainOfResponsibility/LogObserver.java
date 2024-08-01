package Design_Patterns.Behavioral_Patterns.ChainOfResponsibility;

public abstract class LogObserver {
    public static final int  INFO=1;
    public static final int  DEBUG=2;
    public static final int  ERROR=3;
    LogObserver nextLoggerProcesor;
    public LogObserver(LogObserver nextLoggerProcesor) {
        this.nextLoggerProcesor= nextLoggerProcesor;
    }

    public void log(int level,String message) {
        if(nextLoggerProcesor!=null) {
            nextLoggerProcesor.log(level,message);
        }
    }


}
