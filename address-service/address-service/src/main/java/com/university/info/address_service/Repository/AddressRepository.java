package com.university.info.address_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.info.address_service.Entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	

}
