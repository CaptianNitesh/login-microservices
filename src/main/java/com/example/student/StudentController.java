package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentDetails ob;
	
	@GetMapping("/studentall")
	public List<StudentPOJO> getAll() {
		return ob.findAll();
		
	}

}
