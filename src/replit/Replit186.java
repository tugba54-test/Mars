package replit;
import java.util.*;
public class Replit186 {
	 public static void main(String[] args){
		    LinkedList<Integer>num=new LinkedList<>();
		    
		    for(int i=2;i<101;i++){
		     boolean prime=true;
		    for(int y=2;y<i;y++) {
		    	if(i%y==0) {
		    		prime=false;
		   
		   break;
		    	} 
		      }
		   
		    if(prime) {
		    	num.add(i);
		    }}
		    System.out.println(num);
		    
		    
		    LinkedList<Integer>num1=new LinkedList<>();
		    num1.add(111);
		        num1.add(222);
		        num1.add(333);
		        num1.add(444);
		        num1.add(555);
		        num1.add(666);
		        int sum=0;
		        for(int i=0; i<num1.size();i++){
		            sum+=num1.get(i);
		              
		            }System.out.println("Result of sum is "+sum);


		    
		  }

		
		  }

		

	


	



	 