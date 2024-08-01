package Design_Patterns.Behavioral_Patterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogObserver logger=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(1,"This Is information");
        logger.log(2,"This is Debug Statement");
        logger.log(3,"This is Error Statement");
    }
}
