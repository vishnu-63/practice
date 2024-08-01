package Design_Patterns.Behavioral_Patterns.ChainOfResponsibility;

public class ErrorLogProcessor extends LogObserver{
    public ErrorLogProcessor(LogObserver nextLoggerProcesor) {
        super(nextLoggerProcesor);
    }

    @Override
    public void log(int level, String message) {

        /*
        if we need to print level wise then
        if(this.level<=level) {
            System.out.println("ERROR: " +message);
        }
        if (nextLoggerProcesor!=null){
            super.log(level, message);
        }
        */
        if(level==ERROR) {
            System.out.println("ERROR: " +message);
        }
        else{
            super.log(level, message);
        }
    }
}
