package com.buyernew.util.buyer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

    public Buyer findBuyerByBuyerEmail(String buyer_email);
    //public void deleteBuyerById(int id);
    public Buyer findBuyerById(int id);
}
