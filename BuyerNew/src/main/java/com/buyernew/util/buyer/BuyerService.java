package com.buyernew.util.buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers() {
        return buyerRepository.findAll();
    }

    public Buyer getBuyerByBuyerEmail(String buyer_email) {
        return buyerRepository.findBuyerByBuyerEmail(buyer_email);
    }

    public Buyer createBuyer(Buyer buyer) {return buyerRepository.save(buyer);}

    public Buyer updateBuyer(int id, Buyer buyerDetails){
        Buyer buyer = buyerRepository.findBuyerById(id);
        buyer.setBuyer_email(buyerDetails.getBuyer_email());
        buyer.setBuyer_lastname(buyerDetails.getBuyer_lastname());

        return buyerRepository.save(buyer);
    }

    // public void deleteBuyer(int id){buyerRepository.deleteBuyerById(id);}
}
