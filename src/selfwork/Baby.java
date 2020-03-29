package selfwork;

import java.util.Scanner;

public class Baby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		   char reverse = 0;
		  int length=givenString.length();
		   for(int i=length-1;i>=0; i++)
		     reverse=givenString.charAt(i);
		    
		   if(givenString.equals(reverse))
		   System.out.println("true");
		   else
		   System.out.println("false");
		   	
		   	
		  }
		}

	


