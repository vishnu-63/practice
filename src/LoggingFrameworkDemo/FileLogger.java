package LoggingFrameworkDemo;

public class FileLogger implements LogObserver{
    @Override
    public void log(String message) {
        System.out.println("Write into File: "+message);
    }
}
