package Replit167;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanArrayLstNm {

	public static void main(String[] args) {
    ArrayList<Object>num=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<=5;i++) {
    	num.add(scan.nextLine());
    }
    System.out.println(num);
    for(Object n:num) {
    	System.out.print(n+" ");
    }
   
	}

}
