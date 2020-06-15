package Exam26;

public class S41 {

	public static void main(String[] args) {
		// valid parameters for switch String,int,short,byte,char
		//invalid long float ,boolean ,double
		//boolean opt=true; **switch boolean la calismiyr,long float 
		String opt="true";
		
		switch (opt) {
		case "true":
			System.out.println("true");
			break;

		default:
			System.out.println("****");
			break;
		}
System.out.println("Done");
	}

}
