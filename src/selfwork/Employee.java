package selfwork;

public class Employee {
	int eID , salary;
	static String Ceo="Sumair";
	
  

	public static void main(String[] args) {
		//  Create a Class called Employee:
//			Create three  variables  eID , salary and set the CEO to “Sumair” 
//			Create two objects of the class Employee 
//			Set the value of eID, salary for each of the objects
//			Print out the eID , salary and  CEO for each of the objects 
//			----------------------------------------------
//			Create a Class called Students
//			Create three  variables  studentName , studentID  and  numberOfStudents
//			Create three objects of the Students Class 
//			Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//			Print out  total number of students
		Employee em1=new Employee();
		em1.eID=2345;
		em1.salary=7000;
		
		Employee em2=new Employee();
		em2.eID=2675;
		em2.salary=7500;
		System.out.println("My id number is "+em1.eID+"my salary is "+em1.salary+" our ceo muz "+Ceo);
		System.out.println("My id number is "+em2.eID+"my salary is "+em2.salary+" our ceo muz "+Ceo);
		
		

	}





}
