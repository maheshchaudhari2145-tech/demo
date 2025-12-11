package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.model.Customer;

public interface CustomerService {

	void add(Customer customer);

	List<CustomerDTO> display();


}
