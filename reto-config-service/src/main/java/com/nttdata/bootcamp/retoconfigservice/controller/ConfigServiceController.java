package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServiceController {

	@Value("${reto.config-service}")
	private String myConfig;
	    
	@GetMapping(path="/getConfig")
	public String myConfig() {
	   	 return this.myConfig;
	}
}
