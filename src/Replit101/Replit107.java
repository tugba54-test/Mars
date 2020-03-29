package Replit101;

public class Replit107 {
	String name;
	String text;
	
	void greet(){
		System.out.println("Welcome "+name);
		System.out.println("Welcome "+text);
		
	}
	

	public static void main(String[] args) {
		// 1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
//		2. Create another method as syntaxStudents and write the logic for 
//		that method in println statement as "Welcome Syntax Students!"
//		3. Call both methods
		
		 Replit107 str=new  Replit107();
		 str.name="Syntax Technologies!";
		 str.text="Syntax Students!";
		 str.greet();
		 
		 
	}

}
