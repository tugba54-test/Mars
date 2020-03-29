package Replit101;

public class Replit103 {
	String breed, name, color;
	
	
	
	
	void bark() {
		System.out.println(breed+" can bark");
	}void run(){
		System.out.println(breed+" can run");
	}void play(){
		System.out.println(breed+" can play");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In this class, you should specify the following attributes: breed, name, color, and 
//		following behaviors: bark(), run(), play().
//		Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//
//		The output of the program should be as following:
//		 
//		Husky can bark
//		Husky can run
//		Husky can play
//		Bulldog can bark
//		Bulldog can run
//		Bulldog can play
//		Labrador can bark
//		Labrador can run
//		Labrador can play
		
		Replit103 dog=new Replit103();
		dog.breed="Husky";
		
		Replit103 dog1=new Replit103();
		dog1.breed="Bulldog";
		
		Replit103 dog2=new Replit103();
		dog2.breed="Labrador";
		
		dog.bark();
		dog.run();
		dog.play();
		dog1.bark();
		dog1.run();
		dog1.play();
		dog2.bark();
		dog2.run();
		dog2.play();

	}

}
