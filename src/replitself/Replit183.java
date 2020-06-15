package replitself;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Replit183 {
	
		
		
			 
			  public static void main(String[]args){
			LinkedList<Integer> list=new LinkedList<>();
			 for(int i=50; i<=100;i++){
			   list.add(i);
			 }
			 Iterator<Integer> num=list.iterator();
			
			 while(num.hasNext()){
			   if(num.next()%3!=0){
			     num.remove();
			   }
			 }
			 System.out.println(list);
			}
			 
			 
			 
				
			}

