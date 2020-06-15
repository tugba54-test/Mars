package replitself;
import java.util.*;
import java.util.Map.Entry;

public class Replit204{


		  public static  void display(Map<String,Integer>map){
		    if(map.isEmpty()){
		     System.out.println("Map is empty");
		    }else{
		      Set<String>map1=map.keySet();
		      for(String m:map1) {
		    	 System.out.println(m+" : "+map.get(m));
		      }
		    }
		    
		  }
		  public static void main(String[] args){
		    
		  
		  Map<String,Integer>map=new LinkedHashMap<>();
		  map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		display(map);
		map.clear();
		display(map);
		
		
		
		
		
}}