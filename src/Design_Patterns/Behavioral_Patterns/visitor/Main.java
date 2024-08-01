package Design_Patterns.Behavioral_Patterns.visitor;

public class Main {
    public static void main(String[] args) {
        IRoom singleRoom=new SingleRoom();
        RoomVisitor roomVisitor=new RoomPricingVisitor();
        singleRoom.accept(roomVisitor);
       System.out.println(((SingleRoom) singleRoom).pricing);
    }
}
