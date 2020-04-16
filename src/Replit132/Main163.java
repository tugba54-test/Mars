package Replit132;

public class Main163 {
	static  final String reverse(String word){
		   String reverse="";
		   for(int i=(word.length()-1);i>=0;i--){
		     reverse=reverse+word.charAt(i);
		     }
		   return reverse;
		 }
	static final double avgElements(int[]a) {
		double sum=0;
		double average = 0;
		for(int b:a) {
			sum+=b;
			average=0+(sum/5);
			}
		
		return average;
	    
	  }
		public static void main(String[] args){
		  System.out.println(reverse("hello"));
			int[] a = {2,7,3,8,4};
			System.out.println(avgElements(a)); //should print 4.8
		}
		}
		  
		


