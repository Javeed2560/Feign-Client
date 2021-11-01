package com;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="FignClientAssignmentOne", url = "http://localhost:8081" )
public interface FeignProxy {
	
	@RequestMapping("/student")
	public List<Student> getAllStudents();

}
