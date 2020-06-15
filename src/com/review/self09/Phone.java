package com.review.self09;

public class Phone {
	private String serialNumber;
	private String brand;
	private String password;
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		if(serialNumber.length()==7) {
		this.serialNumber = serialNumber;}
	}
// i will give you serial number
	//if you give me correct password
	public String getSerialNumber(String password) {
		String result="";
		if(this.password.equals(password)) {
			result=serialNumber;
		}else {
			result="Invalid Access!!!";
		}
		return result; 
	}
	// brand is view only
	public String getBrand() {
		return brand;
	}

	

	public double getPrice() {
		return price;
	}

	double price;
	public Phone(String serialNumber,String brand,String password) {
		this.serialNumber=serialNumber;
		this.brand=brand;
		this.password=password;
	}

	public void displayInfo() {
		System.out.println("This is a "+brand+" with serial number "+serialNumber);
		System.out.println("it costs "+price);
	}
}
