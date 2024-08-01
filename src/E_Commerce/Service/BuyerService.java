package E_Commerce.Service;

import E_Commerce.Model.Buyer;
import E_Commerce.Repository.BuyerRepository;

public class BuyerService {
    private BuyerRepository buyerRepository;
    public BuyerService(BuyerRepository buyerRepository){
        this.buyerRepository=buyerRepository;

    }
    public String addBuyer(Buyer buyer){
        Buyer createdBuyer=buyerRepository.addBuyer(buyer);
        return createdBuyer.getBuyerId();

    }
    public Buyer getBuyer(String buyerId){
        return buyerRepository.getBuyer(buyerId);
    }
}
