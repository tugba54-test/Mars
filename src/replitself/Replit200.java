package replitself;
import java.util.*;
import java.util.Map.Entry;
public class Replit200 {
	

	
	  public static void main(String[] args){
	    Map<String,String>ob=new LinkedHashMap<>();
	    ob.put("Street" ,"Patrick ST");
	    ob.put("Suite", "265");
	    ob.put("City" ,"Vienna");
	    ob.put("Zip", "22180");
	    ob.put("Country", "United State");
	    
	    
	    
	    Collection<String>o=ob.values();
	    Iterator<String>it=o.iterator();
	    while(it.hasNext()) {
	    	//String a=it.next();
System.out.println(it.next());
	  }
	    
	    
	    Set<Entry<String,String>>o1=ob.entrySet();
	    for(Entry<String, String> entry:o1) {
			
			String value=entry.getValue();
			System.out.println(value.toUpperCase());
	 
	}

}}
