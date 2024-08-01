package Design_Patterns.Behavioral_Patterns.Command;

public class TurnOffAcCommand implements ICommand{
    AirConditioner ac;
    public TurnOffAcCommand(AirConditioner ac) {
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
