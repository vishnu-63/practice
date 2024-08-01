package Design_Patterns.Behavioral_Patterns.visitor;

public class RoomMaintainanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Performing Maintenance in Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Performing Maintenance in double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Performing Maintenance in Deluxe Room");
    }
}
