package Design_Patterns.Behavioral_Patterns.visitor;

public class SingleRoom implements IRoom{
    public int pricing=0;
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
