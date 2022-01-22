package com.ni3.customerserviceapi.model;


public class Customer {
    private String customerID;
    private String customerName;
    private HotelRoom room;

    public Customer(String customerID, String customerName, HotelRoom room) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.room = room;
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

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }
}
