package replitself;
import java.util.*;
import java.util.Map.Entry;
 
public class Replit203 {
	
	
	  public static void main(String[] args){
	  Map<String,String>map=new HashMap<>();  
	  
	  map.put("ONE","AAA");
	map.put("TWO","BBB");
	map.put("THREE","CCC");
	map.put("FOUR","DDD");
	map.put("FIVE","EEE");
	System.out.println("HashMap Before Remove :");
	Set<Entry<String,String>>m=map.entrySet();

	Iterator<Entry<String, String>>m1=m.iterator();
	while(m1.hasNext()){
	  Entry<String, String> e=m1.next();
	  String result=e.getKey()+" : "+e.getValue();
	  System.out.println(result);
	}
	System.out.println("HashMap After Remove :");
	map.replace("THREE", "ASEL");
	map.replace("FIVE", "SUMAIR");
	Set<Entry<String,String>>m2=map.entrySet();

	Iterator<Entry<String, String>>it=m2.iterator();
	while(it.hasNext()){
	  Entry<String, String> e=it.next();
	  String result=e.getKey()+" : "+e.getValue();
	  System.out.println(result);
	}
	


	 
	}}
