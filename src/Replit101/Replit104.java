package Replit101;




public class Replit104 {
	String name;
	void implement() {
		System.out.println(name+" method implementation");
		
	}

	public static void main(String[] args) {
		// 1. create method and name as m1. Inside your method body add print statement as "m1 method implementation"
		//2. create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
		//3. Call these two methods in the main method
	
		Replit104 str=new Replit104();
		str.name="m1";
		
		Replit104 str1=new Replit104();
		str1.name="m2";
		str.implement();
		str1.implement();
		
		

	}

}
