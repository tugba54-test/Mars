package selfwork;

public class Student {
	 String studentName;
	 int studentID; 
	  static int numberOfStudents;
	  
	  
	  
	 
	 void display() {
		 numberOfStudents++;
		 System.out.println("my student name "+studentName+" my student id "+studentID+" i am number "+numberOfStudents );
	 }

	public static void main(String[] args) {
//		Create a Class called Students
//		Create three  variables  studentName , studentID  and  numberOfStudents
//		Create three objects of the Students Class 
//		Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//		Print out  total number of students
		
		
		Student obj=new Student();
		obj.studentName="Ahmet";
		obj.studentID=1234; 
		//obj.numberOfStudents=1;
		
		
		Student obj1=new Student();
		obj1.studentName="veli";
		obj1.studentID=12345; 
		//obj1.numberOfStudents=2;
		obj1.display();
		obj.display();


	}

}
