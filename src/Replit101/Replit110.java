package Replit101;

public class Replit110 {
	int add(int a,int b) {
		int x=0;
		int y=0;
		int z=a+b;
		return z;
		
	}
	int mult(int a,int b) {
		int c,d,e;
	e=a*b;
	return e;
	}
	int sub(int a,int b) {
		int d,e,c;
		c=a-b;
		return c;}
		public static void main(String[] args) {
		// Step1: Create three methods that will accept 2 in parameters on integer type
//		Step2: Write the logic in methods to perform actions below:
//			The first method for multiplication
//			The second method for addition 
//			The third method for subtraction
//			Step3: execute all methods
//			1. for the addition method add two numbers to make 30 
//			2. for multiplication multiply two numbers to make 30 
//			3. for Subtraction subtract two numbers to equal 20
//			Expected Output:
//			Addition 30
//			Multiplication 30
//			Subtraction 20
		Replit110 obj=new Replit110();
		System.out.println(obj.add(10,20));
		System.out.println(obj.mult(6, 5));
		System.out.println(obj.sub(30, 10));


	}


}
