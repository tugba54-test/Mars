package Replit101;

public class Replit106 {
	String name, text;
	
	void rt() {
		System.out.println( name+" method implementation");
		System.out.println("displayLine  method implementation");
	}

	public static void main(String[] args) {
		// 1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
//		1. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
//		3. Call both methods
//
//		Expected Output:
//		newLine method implementation
//		displayLine method implementation
		
		Replit106 str=new Replit106();
         str.name="newLine";
         
         
         str.rt();
	}

}
