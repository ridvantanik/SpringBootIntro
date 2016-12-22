package com.fnd.term.services;

import org.springframework.stereotype.Service;

@Service
public class FirstNameService {
	private String name = "AHMET";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
