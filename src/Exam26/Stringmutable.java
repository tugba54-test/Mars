package Exam26;

public class Stringmutable {

	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer("Navin");
		sbf.append(" Reddy");
		
		sbf.replace(0, 5, "Manoj");
		sbf.delete(8, 10);
		
		sbf.reverse();
		
		System.out.println(sbf);

	}

}
