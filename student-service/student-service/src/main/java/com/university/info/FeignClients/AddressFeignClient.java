package com.university.info.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.university.info.student_service.Response.AddressResponse;

@FeignClient(url="${address.service.url}",value ="address-feign-client",path = "/api/address")
public interface AddressFeignClient {
	
	@GetMapping("/getById/{id}")
	public AddressResponse getById(@PathVariable long id);


}
