package com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

	@Setter
	@Getter
	private Long id;
	
	@Setter
	@Getter
	private String name;
}
