package com.ni3.customerserviceapi.dao;

import com.ni3.customerserviceapi.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, String> {

}
