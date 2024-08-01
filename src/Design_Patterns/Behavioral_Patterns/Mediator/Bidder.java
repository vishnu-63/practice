package Design_Patterns.Behavioral_Patterns.Mediator;

public class Bidder implements Colleague{
    private String name;
    AuctionMediator auctionMediator;
    public Bidder(String name,AuctionMediator auctionMediator){
        this.name=name;
        this.auctionMediator=auctionMediator;
        auctionMediator.addBidder(this);

    }
    @Override
    public void placeBid(int bitAmount) {
        auctionMediator.placeBid(this,bitAmount);

    }

    @Override
    public void recieveBidNotificaton(int bitAmount) {
        System.out.println("Recieved Bit Notification For The amount "+bitAmount);

    }

    @Override
    public String getName() {
        return name;
    }
}
