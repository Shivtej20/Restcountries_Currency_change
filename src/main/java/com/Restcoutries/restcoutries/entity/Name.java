package com.Restcoutries.restcoutries.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {
	
	private String common;
	private String official;
	private Object nativeName;
//	private List<String> nativeName;
	
	
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}
	public String getOfficial() {
		return official;
	}
	public void setOfficial(String official) {
		this.official = official;
	}
	public Object getNativeName() {
		return nativeName;
	}
	public void setNativeName(Object nativeName) {
		this.nativeName = nativeName;
	}
	
	
	@Override
	public String toString() {
		return "Name [common=" + common + ", official=" + official + ", nativeName=" + nativeName + "]";
	}
	
	
	public Name(String common, String official, Object nativeName) {
		super();
		this.common = common;
		this.official = official;
		this.nativeName = nativeName;
	}
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	public String getCommon() {
//		return common;
//	}
//	public void setCommon(String common) {
//		this.common = common;
//	}
//	public String getOfficial() {
//		return official;
//	}
//	public void setOfficial(String official) {
//		this.official = official;
//	}
//	
//	@Override
//	public String toString() {
//		return "Name [common=" + common + ", official=" + official + "]";
//	}
//	
//	public Name(String common, String official) {
//		super();
//		this.common = common;
//		this.official = official;
//	}
//	public Name() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	

}
