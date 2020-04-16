package selfwork;

public class Hospital {
	public static void main(String[] args) {
		Doctor doc1;
		doc1=new Doctor("john Smith","12345",150000);
//		doc1.name="john Smith";
//		doc1.licenceId="12345";
//		doc1.salary=150000;
		doc1.displayInfo();
		doc1.chargePatient();
		doc1.treatPatient("Adam smith");
		
	}

}
