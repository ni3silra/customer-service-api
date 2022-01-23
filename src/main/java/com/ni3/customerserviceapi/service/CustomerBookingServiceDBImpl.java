package com.ni3.customerserviceapi.service;

import com.ni3.customerserviceapi.dao.CustomerRepo;
import com.ni3.customerserviceapi.model.Customer;
import com.ni3.customerserviceapi.model.HotelRoom;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerBookingServiceDBImpl implements CustomerBookingService{

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        customerRepo.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer getCustomerByID(String customerID) {
        return customerRepo.findById(customerID).orElse(null);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public int getHotelRoomByCustomer(String customerID) {
        return 0;
        // TODO Hotel Room Integration for Customer in DB
    }

    @Override
    public void updateCustomer(Customer customer, String customerID) {
        customerRepo.save(customer);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerRepo.deleteById(customerId);
    }

    @Override
    public List<HotelRoom> getAvailableRoom() {
        return null;
    }

}
