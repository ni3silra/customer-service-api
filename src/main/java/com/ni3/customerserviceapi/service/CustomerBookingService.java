package com.ni3.customerserviceapi.service;

import com.ni3.customerserviceapi.dao.CustomerDao;
import com.ni3.customerserviceapi.model.AvailableHotel;
import com.ni3.customerserviceapi.model.Customer;
import com.ni3.customerserviceapi.model.HotelRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CustomerBookingService {

    @Autowired
    private CustomerDao customerDao;

    private List<Customer> customerList;

    @PostConstruct
    public void setData(){
        customerList =  customerDao.getCustomerList();
    }

    public List<Customer> getAllCustomer() {
        return customerList;
    }

    public HotelRoom getHotelRoomByCustomer(String customerID) {
        return customerList.stream()
                .filter(customer -> customer.getCustomerID().equals(customerID))
                .map(Customer::getRoom)
                .findFirst()
                .get();
    }

    public Customer getCustomerByID(String customerID) {
        return customerList.stream()
                .filter(customer -> customer.getCustomerID().equals(customerID))
                .findFirst()
                .get();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void updateCustomer(Customer customer,String customerID) {
        for(Customer customer1 : customerList){
            if(customer.getCustomerID() == customerID){
                customer1.setCustomerName(customer.getCustomerID());
                customer1.setRoom(customer.getRoom());
            }
        }
    }

    public void deleteCustomer(String customerId) {
        for(int i =0;i< customerList.size();i++) {
            if(customerList.get(i).getCustomerID() == customerId){
                customerList.remove(i);
                return;
            }
        }
    }

    public List<HotelRoom> getAvailableRoom() {
        RestTemplate restTemplate = new RestTemplate();

        AvailableHotel availableHotel =  restTemplate.getForObject("http://localhost:8081/room/available", AvailableHotel.class);
        return availableHotel.getRoomList();
    }
}
