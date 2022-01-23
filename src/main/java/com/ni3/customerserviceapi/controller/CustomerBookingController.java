package com.ni3.customerserviceapi.controller;

import com.ni3.customerserviceapi.model.Customer;
import com.ni3.customerserviceapi.model.HotelRoom;
import com.ni3.customerserviceapi.service.CustomerBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerBookingController {

    @Autowired
    @Qualifier("dbService")
    CustomerBookingService customerBookingService;

    // GET ALL CUSTOMER
    @GetMapping("/all")
    public List<Customer> getAllCustomer(){
        return customerBookingService.getAllCustomer();
    }

    // GET CUSTOMER BY ID
    @GetMapping("/hotelroom/{customerID}")
    public Customer getCustomerByID(@PathVariable String customerID){
        return customerBookingService.getCustomerByID(customerID);
    }
    // GET HOTEL BY CUSTOMER
    @GetMapping("/customer/{customerID}")
    public int getHotelRoomByCustomer(@PathVariable String customerID){
        return customerBookingService.getHotelRoomByCustomer(customerID);
    }

    // POST CUSTOMER
    @PostMapping("/add")
    public void createCustomer(@RequestBody Customer customer){
        customerBookingService.addCustomer(customer);
    }
    // PUT CUSTOMER
    @PutMapping("/update/{customerID}")
    public void updateCustomer(@RequestBody Customer customer,@PathVariable String customerID){
        customerBookingService.updateCustomer(customer,customerID);
    }

    // DELETE CUSTOMER
    @DeleteMapping("/delete/{customerID}")
    public void deleteCustomer(@PathVariable String customerId){
        customerBookingService.deleteCustomer(customerId);
    }

    @GetMapping("/available")
    public List<HotelRoom> getAvailableRoom(){
        return customerBookingService.getAvailableRoom();
    }
}
