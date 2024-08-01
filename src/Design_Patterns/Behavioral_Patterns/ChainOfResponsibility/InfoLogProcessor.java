package Design_Patterns.Behavioral_Patterns.ChainOfResponsibility;

public class InfoLogProcessor extends LogObserver{
    public InfoLogProcessor(LogObserver nextLoggerProcesor) {
        super(nextLoggerProcesor);
    }

    @Override
    public void log(int level, String message) {
        if(level==INFO){
            System.out.println("INFO: "+message);
        }
        else {
            super.log(level, message);
        }
    }
}
