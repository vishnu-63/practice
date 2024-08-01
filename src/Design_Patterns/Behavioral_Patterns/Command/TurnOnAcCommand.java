package Design_Patterns.Behavioral_Patterns.Command;

public class TurnOnAcCommand implements ICommand{

    AirConditioner ac;
    public TurnOnAcCommand(AirConditioner ac) {
        this.ac=ac;
    }


    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
