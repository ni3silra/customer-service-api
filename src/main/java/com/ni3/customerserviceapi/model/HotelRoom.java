package com.ni3.customerserviceapi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details About Hotel Room")
public class HotelRoom {

    @ApiModelProperty(notes = "The unique id of hotel room")
    private int hotelId;

    @ApiModelProperty(notes = "price of hotel room")
    private int price;

    @ApiModelProperty(notes = "Hotel room availability flag")
    private boolean isAvailable;

    public static HotelRoom newBuilder(){
        return new HotelRoom();
    }

    public int getHotelId() {
        return hotelId;
    }

    public HotelRoom setHotelId(int hotelId) {
        this.hotelId = hotelId;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public HotelRoom setPrice(int price) {
        this.price = price;
        return this;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public HotelRoom setAvailable(boolean available) {
        isAvailable = available;
        return this;
    }

    public HotelRoom build(){
        return this;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "hotelId=" + hotelId +
                ", price=" + price +
                '}';
    }
}
