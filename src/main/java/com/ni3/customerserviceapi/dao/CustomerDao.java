package com.ni3.customerserviceapi.dao;

import com.ni3.customerserviceapi.model.Customer;
import com.ni3.customerserviceapi.model.HotelRoom;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDao {

    List<Customer> customerList;

    @PostConstruct
    public void fillCustomerDB() {
        String[] customerID = {"A", "B", "C", "D","E"};
        String[] customerName = {"Alan","Bob", "Chris", "David", "Elke"};
      //  HotelRoom[] hotelRooms = {null, null, null, null, null};

        customerList = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            customerList.add(new Customer(customerID[i],customerName[i], 0));

    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
