package com.shohan.DependencyInjection;

public class Address {
	private String street;
	private String county;
	
	public Address() {
		
	}

	public Address(String street, String county) {
		this.street = street;
		this.county = county;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", county=" + county + "]";
	}
	
	
	
}
