package master;

import java.util.Scanner;

public class Replit94 {

	public static void main(String[] args) {
		// If browser is ChRoME it should print the: 
//		"Proceed with Chrome browser"
//
//		If browser is FireFOX it should print the: 
//		"Proceed with Firefox browser"
//
//		If browser is IE it should print the:
//		"Proceed with IE browser"
//
//		If any other browser it should print the:  
//		"Invalid browser"
		 Scanner sc = new Scanner(System.in); 		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		    String message = null;
		    for(int i=0; i<browser.length();i++);	
		    	switch(browser.equals.charAt(browser)) {
		    case "ChRome":
		    	message="Proceed with Chrome browser";		    	break;
	    case "FireFox":
		    	message="Proceed with Firefox browser";
		    	break;
		    case "IE":		    	
		    	message="Proceed with IE browser";
		    	break;
		    	default:
		    		message="Invalid browser";
		    		    }		    System.out.println(message);
//		  }
//		    if(browser.equalsIgnoreCase("Chrome")) {
//		    	message="Proceed with Chrome browser";
//		    }else if(browser.equalsIgnoreCase("FireFox")) {
//		    	message="Proceed with Firefox browser";
//		    }else if(browser.equalsIgnoreCase("IE")) {
//		    	message="Proceed with IE browser";
//		    }else  {
//		    	message="Invalid browser";
//		
//		    }
//		    System.out.println(message);
//
//	}
}
