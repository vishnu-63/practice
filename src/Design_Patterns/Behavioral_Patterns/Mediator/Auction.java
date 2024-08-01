package Design_Patterns.Behavioral_Patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague> colleagues;
    public Auction() {
        this.colleagues=new ArrayList<>();
    }
    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague:colleagues){
            if(colleague.getName().equals(bidder.getName())){
                colleague.recieveBidNotificaton(bidAmount);
            }
        }
    }
}
