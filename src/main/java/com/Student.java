package com;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Getter
	@Setter 
	private Long id;
	
	@Getter
	@Setter 
	private String name;
	
	@Getter
	@Setter 
	private List<Course> course;
	
}
