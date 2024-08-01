package Design_Patterns.Behavioral_Patterns.ChainOfResponsibility;

public class DebugLogProcessor extends LogObserver{

    public DebugLogProcessor(LogObserver nextLoggerProcesor) {
        super(nextLoggerProcesor);
    }

    @Override
    public void log(int level, String message) {
        if(level==DEBUG) {
            System.out.println("DEBUG: "+message);
        }
        else {
            super.log(level, message);
        }
    }
}
