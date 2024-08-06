package com.university.info.student_service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.info.FeignClients.AddressFeignClient;
import com.university.info.student_service.Entity.Student;
import com.university.info.student_service.Repository.StudentRepository;
import com.university.info.student_service.Request.StudentRequest;
import com.university.info.student_service.Response.StudentResponse;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AddressFeignClient addressFeignClient;
	
	public StudentResponse createStudent(StudentRequest studentRequest) {
		Student student=new Student();
		student.setFirstname(studentRequest.getFirstname());
		student.setLastname(studentRequest.getLastname());
		student.setEmail(studentRequest.getEmail());
		student.setAddressId(studentRequest.getAddressId());
		
		student=studentRepository.save(student);
		
		StudentResponse studentResponse = new StudentResponse(student);
		
		//studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
		
		studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));

		return studentResponse; 
	}
	
	public StudentResponse getById (Integer id) {
		Student student = studentRepository.findById(id).get();
		StudentResponse studentResponse = new StudentResponse(student);
		
		
		
		studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));
		
		return studentResponse;
	}

	
//	public StudentResponse getById(Integer id) {
//		Student student=new Student();
//		student=studentRepository.findById(id).get();
//		
//		return new StudentResponse(student);
//		
//	}
	

}
