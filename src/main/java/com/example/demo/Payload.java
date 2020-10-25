package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Payload implements Serializable {
    @Expose
    private String amount;
    @Expose
    private String currency;
    @Expose
    private String country;
    @Expose
    private String description;
    @Expose
    private String payment_method;
    @Expose
    private String public_key;
    @Expose
    private String tx_ref;
    @Expose
    private String redirect_url;
    @Expose
    private Customer customer;

    public Payload() {
        customer = new Customer();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public void setEmail(String email) {
        customer.setEmail(email);
    }

    public void setName(String name) {
        customer.setName(name);
    }

    public void setPhonenumber(String phonenumber) {
        customer.setPhone_number(phonenumber);
    }

    public String getPublic_key() {
        return public_key;
    }

    public void setPublic_key(String public_key) {
        this.public_key = public_key;
    }

    public String getTx_ref() {
        return tx_ref;
    }

    public void setTx_ref(String tx_ref) {
        this.tx_ref = tx_ref;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        return gson.toJson(this);
    }
}
