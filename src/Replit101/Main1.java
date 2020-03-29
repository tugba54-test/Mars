package Replit101;

public class Main1 {
	String Color, Make;
	int Year;

	public static void main(String[] args) {
		// Create a class named 'Main' with specific attributes.
//		Create two objects of that class in which you will be assigning the following values and then print them.
//		carColor='Black'
//		carYear=2019
//		carMake='BMW'
//
//		carColor='White'
//		carYear=2018
//		carMake='Toyota'

		Main1 car = new Main1();
		car.Color = "Black";
		car.Year = 2019;
		car.Make = "BMW";

		Main1 car1 = new Main1();
		car1.Color = "White";
		car1.Year = 2018;
		car1.Make = "Toyota";
		System.out.println("Car color is "+car.Color+" and car year is "+car.Year+" and car model is "+car.Make);
		System.out.println("Car color is "+car1.Color+" and car year is "+car1.Year+" and car model is "+car1.Make);
	}

}
