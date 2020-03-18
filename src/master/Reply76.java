package master;

import java.util.Scanner;

public class Reply76 {

	public static void main(String[] args) {
		// Write a program that creates a String array with size 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array
//
//		Example:
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday etc
		Scanner input=new Scanner(System.in);
	
      String[] day ;
		for(int i=0;i<7;i++) {
			System.out.println("please enter "+(i+1)+" day of the week");
         day[]=input.Next();
			
			
			
		}
		for(int i=0;i<7;i++) {
			System.out.println(day[i]);

		
	}
		

	}
}
