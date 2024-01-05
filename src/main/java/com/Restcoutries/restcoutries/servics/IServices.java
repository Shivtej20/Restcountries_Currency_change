package com.Restcoutries.restcoutries.servics;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public interface IServices {
	
	public String getRestCountries(String countryName) throws JsonMappingException, JsonProcessingException;

}
