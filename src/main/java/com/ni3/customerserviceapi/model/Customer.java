package com.ni3.customerserviceapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String customerID;
    private String customerName;
    private int roomID;

    public Customer() {
    }

    public Customer(String customerID, String customerName, int roomID) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.roomID = roomID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRoom() {
        return roomID;
    }

    public void setRoom(int roomID) {
        this.roomID = roomID;
    }
}
