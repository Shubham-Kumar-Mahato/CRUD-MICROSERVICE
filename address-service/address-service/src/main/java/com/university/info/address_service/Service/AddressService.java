package com.university.info.address_service.Service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.info.address_service.Entity.Address;
import com.university.info.address_service.Repository.AddressRepository;
import com.university.info.address_service.Request.CreateAddressRequest;
import com.university.info.address_service.Response.AddressResponse;

import ch.qos.logback.classic.Logger;

@Service
public class AddressService {
	
	Logger logger=(Logger) LoggerFactory.getLogger(AddressService.class);
	
	@Autowired
	private AddressRepository addressRepository;
	
	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
		Address address=new Address();
		
	address.setStreet(createAddressRequest.getStreet());
	address.setCity(createAddressRequest.getCity());
	addressRepository.save(address);
	
	return new AddressResponse(address);
	}
	
	public AddressResponse getById(Integer id) {
		logger.info("Inside getById"+id);
		
		Address address=addressRepository.findById(id).get();
		
		return new AddressResponse(address);
		
	}

}
