package com.buyernew.util.buyer;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "buyer")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "buyer_email", nullable = false, unique = true)
    private String buyer_email;

    @Column(name = "buyer_firstname", nullable = false)
    private String buyer_firstname;

    @Column(name = "buyer_lastname", nullable = false)
    private String buyer_lastname;

    @Column(name = "buyer_password", nullable = false)
    private String buyer_password;

    @Column(name = "buyer_streetAddress", nullable = false)
    private String buyer_streetAddress;

    @Column(name = "buyer_city", nullable = false)
    private String buyer_city;

    @Column(name = "buyer_zipcode", nullable = false)
    private int buyer_zipcode;

    @Column(name = "buyer_country", nullable = false)
    private String buyer_country;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @CreationTimestamp
    private Date updatedAt;

    public Buyer(){

    }

    public Buyer(String buyer_firstname, String buyer_lastname, String buyer_email, String buyer_password, String buyer_streetAddress, String buyer_city, int buyer_zipcode, String buyer_country){
        this.setBuyer_firstname(buyer_firstname);
        this.setBuyer_lastname(buyer_lastname);
        this.setBuyer_email(buyer_email);
        this.setBuyer_password(buyer_password);
        this.setBuyer_streetAddress(buyer_streetAddress);
        this.setBuyer_city(buyer_city);
        this.setBuyer_zipcode(buyer_zipcode);
        this.setBuyer_country(buyer_country);
    }

    public int getId(){return id;}

    public String getBuyer_firstname(){return buyer_lastname;}

    public void setBuyer_firstname(String buyer_firstname) {this.buyer_firstname = buyer_firstname;}

    public String getBuyer_lastname(){return buyer_lastname;}

    public void setBuyer_lastname(String buyer_lastname) {this.buyer_lastname = buyer_lastname;}

    public String getBuyer_email(){return buyer_email;}

    public void setBuyer_email(String buyer_email) {this.buyer_email = buyer_email;}

    public String getBuyer_password(){return buyer_password;}

    public void setBuyer_password(String buyer_password) {this.buyer_password = buyer_password;}

    public String getBuyer_streetAddress(){return buyer_streetAddress;}

    public void setBuyer_streetAddress(String buyer_streetAddress) {this.buyer_streetAddress = buyer_streetAddress;}

    public String getBuyer_city(){return buyer_city;}

    public void setBuyer_city(String buyer_city) {this.buyer_city = buyer_city;}

    public int getBuyer_zipcode(){return buyer_zipcode;}

    public void setBuyer_zipcode(int buyer_zipcode) {this.buyer_zipcode = buyer_zipcode;}

    public String getBuyer_country(){return buyer_country;}

    public void setBuyer_country(String buyer_country) {this.buyer_country = buyer_country;}

    public Date getCreatedAt() {return createdAt;}

    public void setCreatedAt(Date createdAt){this.createdAt = createdAt;}

    public Date getUpdatedAt(){ return updatedAt;}

    public void setUpdatedAt(Date updatedAt){this.updatedAt = updatedAt;}
}
