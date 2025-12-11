package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.model.Customer;

public class CustomerDTOMapper {
	
	public static List<CustomerDTO> convertIntoDTO(List<Customer> customer){
		
		List<CustomerDTO> dto = new ArrayList<>();
		
		for( Customer x : customer) {
			dto.add(new CustomerDTO(x.getId(), x.getName(), x.getEmail(), x.getAddress(), x.getMob()));
		}
	
		return dto;
	
	}
	

	public static CustomerDTO convertIntoDTO(Customer customer){
		
		CustomerDTO dto = new CustomerDTO(
					customer.getId(),
					customer.getName(), 
					customer.getEmail(),
					customer.getAddress(),
					customer.getMob());
		
	
		return dto;
	
	}
	
	

}
