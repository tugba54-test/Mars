package Replit167;

import java.util.ArrayList;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer>num1=new ArrayList<>();
		 Scanner input=new Scanner(System.in);
		 for(int i=0;i<5;i++) {
			 num1.add(input.nextInt());
		 }
		 for(int n:num1) {
			 System.out.print(n+" ");
		 }

	}

}
