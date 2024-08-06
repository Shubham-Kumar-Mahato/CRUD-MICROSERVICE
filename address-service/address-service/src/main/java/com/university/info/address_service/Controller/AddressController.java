package com.university.info.address_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.info.address_service.Request.CreateAddressRequest;
import com.university.info.address_service.Response.AddressResponse;
import com.university.info.address_service.Service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/create")
	public ResponseEntity<AddressResponse> createAddress(@RequestBody CreateAddressRequest createAddressRequest){
		AddressResponse add=addressService.createAddress(createAddressRequest);
		return new ResponseEntity<AddressResponse>(add,HttpStatus.OK);
		
	}
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<AddressResponse> getById(@PathVariable Integer id){
		AddressResponse addressResponse=addressService.getById(id);
		
		return new ResponseEntity<AddressResponse>(addressResponse,HttpStatus.ACCEPTED);
	}

}
