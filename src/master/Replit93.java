package master;

import java.util.Scanner;

public class Replit93 {

	public static void main(String[] args) {
		//For you to do:

//You have Scanner class to input string value. 
//
//If language is Java it should print the: 
//"Java is a programming language".
//
//If language is C it should print the:
//"C is a procedural programming language"
//
//If language is C++ it should print the:
//"C++ is a middle-level programming language"
//
//If any other should print:
//"Doesn't match any programming language"
// 
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine();
		   if(language.contentEquals("Java")) {
			   System.out.println("Java is a programming language");
		   }else if(language.contentEquals("C")) {
				   System.out.println("C is a  procedural programming language");
		   }else if(language.contentEquals("C++")) {
					   System.out.println("C++ is a middle-level programming language");
			   
			   
		   }else {
			   System.out.println("Doesn't match any programming language");
		   }

	}

}
