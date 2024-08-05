package com.university.info.student_service.Response;

import com.university.info.student_service.Entity.Student;

public class StudentResponse {
	
	private Integer id;
	private String firstname;
	private String lastname;
	private String email;
	private AddressResponse addressResponse;
	
	public StudentResponse(Student student) {
		this.id=student.getId();
		this.firstname=student.getFirstname();
		this.lastname=student.getLastname();
		this.email=student.getEmail();
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public AddressResponse getAddressResponse() {
		return addressResponse;
	}


	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}
	
	
	
	

}
