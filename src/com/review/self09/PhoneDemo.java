package com.review.self09;

public class PhoneDemo {

	public static void main(String[] args) {
      Phone p1=new Phone("12345","Iphone","password123");
      p1.price=1200;
      p1.displayInfo();
      
      System.out.println("changing serial number");
       p1.setSerialNumber("bla bla bla");
      p1.displayInfo();
      String serial=p1.getSerialNumber("Tugba123");
      System.out.println(serial);
      
     serial=p1.getSerialNumber("password123");
      System.out.println(serial);
      p1.displayInfo();
	}

}
