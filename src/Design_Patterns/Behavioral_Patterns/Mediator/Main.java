package Design_Patterns.Behavioral_Patterns.Mediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator=new Auction();
        Bidder bidder1=new Bidder("A",auctionMediator);
        Bidder bidder2=new Bidder("B",auctionMediator);
        bidder1.placeBid(1000);
        bidder2.placeBid(2000);
    }
}
