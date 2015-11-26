package com.example.anu;
//{"type":"success","value":{"id":1,"quote":"Working with Spring Boot is like pair-programming with the Spring developers."}}
public class Quote {
	
	private String type;
	private Value value;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	
	@Override
	public String toString(){
		 return "Quote{" +
	                "type='" + type + '\'' +
	                ", value=" + value +
	                '}';
	}
	

}
