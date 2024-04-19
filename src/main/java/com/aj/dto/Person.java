package com.aj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

	private Integer personId;
	private String personName;
	private String dob;
	private String phno;
}
