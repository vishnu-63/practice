package Design_Patterns.Behavioral_Patterns.Command;

public class AirConditioner {
    boolean isTurnOn;
    public AirConditioner() {
        isTurnOn=false;
    }
    public void turnOnAC() {
        isTurnOn=true;
        System.out.println("AC Turned On..");
    }

    public void turnOffAC() {
        isTurnOn=false;
        System.out.println("AC Turned Off..");
    }
}
