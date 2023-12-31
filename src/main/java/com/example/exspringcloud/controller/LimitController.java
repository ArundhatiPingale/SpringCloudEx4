package com.example.exspringcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exspringcloud.configuration.Configuration;

@RestController
public class LimitController {
	@Autowired
	private Configuration configuration; 
	@GetMapping("/limits")
	public Limits retrivelimits()
	{
		return new Limits( configuration.getMinimum() ,configuration.getMaximum());
	}

}
