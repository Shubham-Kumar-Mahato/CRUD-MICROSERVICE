package com.university.info.address_service.Response;

import com.university.info.address_service.Entity.Address;

public class AddressResponse {

	
	 Integer addressId;
	
	 String street;
	
	 String city;
	

	public AddressResponse(Address address) {

		this.addressId = address.getId();
		this.street = address.getStreet();
		this.city = address.getCity();
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
