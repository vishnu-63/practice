package Design_Patterns.Behavioral_Patterns.Command;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner=new AirConditioner();
        MyRemoteControl remoteControl=new MyRemoteControl();
        remoteControl.setCommand(new TurnOffAcCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.setCommand(new TurnOnAcCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.undoCommand();
    }
}
