package Interview;

import java.util.Scanner;

public class Palindromegrup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Was it Eliot's toilet I saw?
		Scanner scan= new Scanner(System.in);
				System.out.println("Please write a word or a sentence");
				String str=scan.nextLine();
				String strLow=str.toLowerCase().replaceAll("[^A-Za-z0-9]","");
				char reverse = 0;
				char mainstr='c';
				for( int i=strLow.length()-1; i>=0; i--) {
					reverse=strLow.charAt(i);
				}for(int i1=0; i1<strLow.length(); i1++) {
					mainstr=strLow.charAt(i1);
				}if( mainstr==reverse) {
					System.out.println(" String is palindrome   ");
				}else {
					System.out.println(" String is not palindrome   ");
				}
	


	}

}
