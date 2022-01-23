package com.ni3.customerserviceapi.service;

import com.ni3.customerserviceapi.model.Customer;
import com.ni3.customerserviceapi.model.HotelRoom;

import java.util.List;

public interface CustomerBookingService {
     List<Customer> getAllCustomer();
     Customer getCustomerByID(String customerID);
     void addCustomer(Customer customer);
     int getHotelRoomByCustomer(String customerID);
     void updateCustomer(Customer customer,String customerID);
     void deleteCustomer(String customerId);
     List<HotelRoom> getAvailableRoom();
}
