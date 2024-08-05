package com.university.info.student_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.info.student_service.Request.StudentRequest;
import com.university.info.student_service.Response.StudentResponse;
import com.university.info.student_service.Service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/create")
	public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest studentRequest){
		StudentResponse studentResponse=studentService.createStudent(studentRequest);
		
		return new ResponseEntity<StudentResponse>(studentResponse,HttpStatus.OK);
		
	}
	
	public ResponseEntity<StudentResponse> getById(@PathVariable Integer id){
		StudentResponse studentResponse=studentService.getById(id);
		
		return new ResponseEntity<StudentResponse>(studentResponse,HttpStatus.ACCEPTED);
		
	}
}
