package replitself;


import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class Replit193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String>country=new TreeSet();
		  country.add("India");
		  country.add("Australia");
		  country.add("South Africa");
		  country.add("India");
		  country.add("America");
		  country.add("America");
		  System.out.println(country);
		  
		  Set<String>color=new HashSet();
		  color.add("Red");
		  color.add("Pink");
		 color.add("Yellow"); 
		 color.add("White") ;
		  color.add("Black");
		  System.out.println("Original Hash Set: "+color);
		  System.out.println("Size of the Hash Set: "+color.size());
		  
	}

}
