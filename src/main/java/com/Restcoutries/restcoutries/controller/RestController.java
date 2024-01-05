package com.Restcoutries.restcoutries.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Restcoutries.restcoutries.entity.ResponseOutput;
import com.Restcoutries.restcoutries.servics.ServicesImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private ServicesImpl service;
	@Autowired
	private ResponseOutput responseOutput;
	
	
	@GetMapping("/restcountries/{countryName}")
	public List<ResponseOutput> getRestCountries(@PathVariable String countryName) throws JsonMappingException, JsonProcessingException {
		service.getRestCountries(countryName);
		
		return Arrays.asList(responseOutput);
	 
	}

}
