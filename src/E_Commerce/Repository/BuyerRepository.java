package E_Commerce.Repository;

import E_Commerce.Model.Buyer;

import java.util.HashMap;

public class BuyerRepository {
    HashMap<String, Buyer> buyers;

    public BuyerRepository() {
        this.buyers = new HashMap<>();
    }

    public Buyer addBuyer(Buyer buyer) {
        if(buyers.get(buyer.getBuyerId())!=null){
            throw new RuntimeException();
        }
        buyers.put(buyer.getBuyerId(),buyer);
        return buyer;

    }
    public Buyer getBuyer(String buyerId){
        Buyer buyer=buyers.get(buyerId);
        return buyer;
    }
}
