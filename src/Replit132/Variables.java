package Replit132;

public class Variables {
	String myInstanceVar="instance variable";
public String myVar="instance variable";   
// instance variable 
public void myMethod(){// local variable
String myVar = "Inside Method";
System.out.println(myVar);
}  
public static void main(String args[]){ 
	Variables obj = new Variables();   // Creating object     
	/* We are calling the method, that changes the  value of myVar.
	 *  We are displaying myVar again after the method call,
	 *   to demonstrate that the local  variable scope is limited to the method itself */ 
	System.out.println("Calling Method");  
	 obj.myMethod();     
	 System.out.println(obj.myVar);
	 
	 
	 System.out.println("----INSTANCE VARIABLES----");
	 Variables obj1 = new Variables();
	 Variables obj2 = new Variables();
	 System.out.println(obj1.myInstanceVar);
	 System.out.println(obj2.myInstanceVar);
	 obj2.myInstanceVar = "Changed Text";
	 System.out.println(obj1.myInstanceVar);
	 System.out.println(obj2.myInstanceVar);
	 }}
	 
	 
	 
	 
	 
	 



