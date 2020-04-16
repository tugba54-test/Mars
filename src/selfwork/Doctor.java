package selfwork;

public class Doctor {
	String name; 
	String licenceId;
	int salary;
	public Doctor(String DoctorName,String DoctorLicenseId,int salary) {
	this.licenceId=DoctorLicenseId;
	this.name=DoctorName;
	this.salary=salary;
	}
	public void CheckUp() {
		System.out.println("Doctor "+name+" has ordered blood test");
	}
	public void treatPatient(String PatientName) {
		System.out.println("Doctor "+name+ " gives prescription to " +PatientName);
	}
	public void chargePatient() {
		System.out.println("Let me charge $100");
	}
	public void displayInfo() {
		System.out.println("Doctor "+name+" with licence id");
	}
	

}
