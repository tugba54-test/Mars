package replitself;
import java.util.*;

public class Replit188 {

	public static void main(String[] args) {
		//[USA, Kazakhstan, Pakistan, Russia]			
		List<String> countries = new LinkedList<>();				
				countries.add("Armenia");
				countries.add("USA");
				countries.add("Kazakhstan");
				countries.add("Australia");
				countries.add("Pakistan");
				countries.add("Russia");
				countries.add("Azerbaijan");
				
			for(String given:countries) {
				System.out.println(given+" ");
			}
				
				
				System.out.println();
				//first way
				Iterator<String>c=countries.iterator();
				while(c.hasNext()) {
					if(c.next().startsWith("A")) {
						c.remove();
					}
					
				}System.out.println(countries);
				
				//Second way
//	            for(int i=0;i<countries.size();i+=2) {
//              countries.remove(i);
//	}System.out.println(countries);
			
	}}
				
				

                   
					
					
				
				


		
	


