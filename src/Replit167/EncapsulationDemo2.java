package Replit167;

public class EncapsulationDemo2 {
	private String empName="John";
	private int empAge=30;
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	

}
class  EncapsulationDemo3{
	  private String empName;
	  private int empAge;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	  
	}