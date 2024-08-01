package Design_Patterns.Behavioral_Patterns.visitor;

public interface IRoom {
    void accept(RoomVisitor roomVisitor);
}
