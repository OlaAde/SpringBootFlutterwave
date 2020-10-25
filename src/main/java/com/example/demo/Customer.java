package com.example.demo;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Customer implements Serializable {
    @Expose
    private String name;
    @Expose
    private String email;
    @Expose
    private String phone_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}