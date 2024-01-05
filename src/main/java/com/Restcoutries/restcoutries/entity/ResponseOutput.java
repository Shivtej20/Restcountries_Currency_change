package com.Restcoutries.restcoutries.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ResponseOutput {
	private String commonName;
	private String officialName;
	private Object nativeName;
	
	private Object currencies;

	private List<String> capital;

	private int population;

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getOfficialName() {
		return officialName;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public Object getNativeName() {
		return nativeName;
	}

	public void setNativeName(Object nativeName) {
		this.nativeName = nativeName;
	}

	public Object getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Object currencies) {
		this.currencies = currencies;
	}

	public List<String> getCapital() {
		return capital;
	}

	public void setCapital(List<String> capital) {
		this.capital = capital;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Response [commonName=" + commonName + ", officialName=" + officialName + ", nativeName=" + nativeName
				+ ", currencies=" + currencies + ", capital=" + capital + ", population=" + population + "]";
	}

	public ResponseOutput(String commonName, String officialName, Object nativeName, Object currencies, List<String> capital,
			int population) {
		super();
		this.commonName = commonName;
		this.officialName = officialName;
		this.nativeName = nativeName;
		this.currencies = currencies;
		this.capital = capital;
		this.population = population;
	}

	public ResponseOutput() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
