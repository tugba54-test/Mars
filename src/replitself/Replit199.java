package replitself;
import java.util.*;
public class Replit199 {
	public static void main(String[] args){
	    Map<String,Integer>map=new LinkedHashMap<>();
	    map.put("mango", 10); 
	    map.put("apple", 30); 
	    map.put("orange", 20); 
	    map.put("mango", 40); 
	    map.put("mango", 40);
	    
	    Set<String>m=map.keySet();
	    Iterator<String>it=m.iterator();
	    while(it.hasNext()){
	     String k=it.next();
	      System.out.println("Key = "+k+" and value = "+map.get(k));
	    }
	    

	  }
	  
	}


