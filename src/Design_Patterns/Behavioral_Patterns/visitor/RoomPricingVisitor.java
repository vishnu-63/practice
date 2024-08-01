package Design_Patterns.Behavioral_Patterns.visitor;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing For Single Room ");
        singleRoom.pricing=1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing For Double Room ");
        doubleRoom.pricing=2000;

    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing For Deluxe Room ");
        deluxeRoom.pricing=2500;

    }
}
