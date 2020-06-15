package Exam26;
class Employee{
	public int salary;
}
class Manager extends Employee{
	public int budget;
}
class Director extends Manager{
	public int stockOptions;
}
public class S37 {

	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		Employee manager1=new Manager();
		Employee director1=new Director();
      Manager d1=new Director();
      d1.budget=90;
      d1.salary=65;
      
		manager1.salary=89;
		director1.salary=65;
		employee1.salary=67;
	}

}
