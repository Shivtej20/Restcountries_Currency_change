package com.Restcoutries.restcoutries.servics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Restcoutries.restcoutries.entity.ResponseOutput;
import com.Restcoutries.restcoutries.entity.RestcoutriesResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ServicesImpl implements IServices{
	@Autowired
	 private ResponseOutput responseOutput;
	
	 ObjectMapper mapper = new ObjectMapper(); 

	@Override
	public String getRestCountries(String countryName) throws JsonMappingException, JsonProcessingException {
		
		String uri = "https://restcountries.com/v3.1/name/" + countryName;
		RestTemplate restTemplate = new RestTemplate();
		String restCountries = restTemplate.getForObject(uri, String.class);
		
		RestcoutriesResponse[] restCountriesResponse = mapper.readValue(restCountries,
				RestcoutriesResponse[].class);
		
		for (RestcoutriesResponse restcountriesResponse2 : restCountriesResponse) {
			
			String commonName = restcountriesResponse2.getName().getCommon();
			System.out.println(commonName);
			responseOutput.setCommonName(commonName);
			
			 String officialName = restcountriesResponse2.getName().getOfficial();
			 System.out.println(officialName);
			 responseOutput.setOfficialName(officialName);
			 
			 Object nativeName = restcountriesResponse2.getName().getNativeName();
			 System.out.println(nativeName);
			 responseOutput.setNativeName(nativeName);
			 
			 Object currencies = restcountriesResponse2.getCurrencies();
			 System.out.println(currencies);
			 responseOutput.setCurrencies(currencies);
			 
			 List<String> capital = restcountriesResponse2.getCapital();
			 System.out.println(capital);
			 responseOutput.setCapital(capital);
			 
			 int population = restcountriesResponse2.getPopulation();
			 System.out.println(population);
			 responseOutput.setPopulation(population);
		}
		return null;
	}
	

}
