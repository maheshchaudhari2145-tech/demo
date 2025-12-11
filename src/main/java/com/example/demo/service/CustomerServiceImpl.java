package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.mapper.CustomerDTOMapper;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository cr;

	@Override
	public void add(Customer customer) {
		cr.save(customer);

	}

	@Override
	public List<CustomerDTO> display(){
		return CustomerDTOMapper.convertIntoDTO(cr.findAll());
	}
	
	
}
