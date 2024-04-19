package com.aj.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
	private Integer userId;
	private String userName;
	private String email;
	private String pwd;
	private Long phone;
}
