package com.buyernew.util.buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @GetMapping(value = "/util/buyers", params = "buyer_email")
    public ResponseEntity<Buyer> getBuyerByBuyerEmail(@RequestParam(name = "buyer_email") String buyer_email) {
        return new ResponseEntity<Buyer>(buyerService.getBuyerByBuyerEmail(buyer_email), HttpStatus.OK);
    }

    @GetMapping("/util/buyers")
    public ResponseEntity<List<Buyer>> getAllBuyers(){
        return new ResponseEntity<>(buyerService.getAllBuyers(), HttpStatus.OK);
    }

    @PostMapping("/util/buyers")
    public ResponseEntity<Buyer> createBuyer(@RequestBody Buyer buyer){
        return new ResponseEntity<>(buyerService.createBuyer(buyer),HttpStatus.OK);
    }

    @PutMapping("/util/buyers/{buyer_id}")
    public ResponseEntity<Buyer> updateBuyer(@PathVariable int buyer_id, @RequestBody Buyer buyer){
        return new ResponseEntity<Buyer>(buyerService.updateBuyer(buyer_id, buyer), HttpStatus.OK);
    }

   /* @DeleteMapping("demo/buyers/{buyer_id}")
        public ResponseEntity deleteBuyer(@PathVariable int buyer_id) {
            buyerService.deleteBuyer(buyer_id);
            return new ResponseEntity(HttpStatus.OK);

        }*/

}
