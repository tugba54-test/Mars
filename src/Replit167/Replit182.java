package Replit167;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit182 {
//	Using Scanner class add 5 elements into ArrayList and then print all elements
	//from that ArrayList all in 1 line
//    Numbers in:4,62,8,5,4
	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       ArrayList<Integer>num=new ArrayList<>();
       num.add(scan.nextInt());
       num.add(scan.nextInt());
       num.add(scan.nextInt());
       num.add(scan.nextInt());
       num.add(scan.nextInt());
       for(int n:num) {
       System.out.print(n+" ");
       
       }
       
	}

}
