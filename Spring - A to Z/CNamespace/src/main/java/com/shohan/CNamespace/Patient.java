package com.shohan.CNamespace;

public class Patient {
	private int id;
	private String name;
	private int nationalId;
	private Address address;

	public Patient() {
	}

	public Patient(int id, String name, int nationalId, Address address) {
		this.id = id;
		this.name = name;
		this.nationalId = nationalId;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId=" + nationalId + ", address=" + address + "]";
	}

}
