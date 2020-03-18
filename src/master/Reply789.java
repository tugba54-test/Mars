package master;

import java.util.Scanner;

public class Reply789 {

	public static void main(String[] args) {
  //Create an int array of integers with a size of 5 and 
		//input values with Scanner. 
		//Don't print prompt questions for a user.
		//Using loop print out each element of the array 
		//that should look like the output below 12345--->10 20 30 40 50
		Scanner input=new Scanner (System.in);
		int number[]=new int[5];
		for(int i=0; i<number.length; i++) {
			number[i]=input.nextInt();
		}for(int y=0;y<number.length;y++ ) {
			System.out.println(number[y]*10);
		}

	}

}
