package replitself;

import java.util.*;
import java.util.Map.Entry;

public class Replit202 {
	 public static void main(String[] args){
		    Map<String,String>map=new HashMap<>();
		    map.put("ONE","AAA");
	map.put("TWO","BBB");
	map.put("THREE","CCC");
	map.put("FOUR","DDD");
	map.put("FIVE","EEE");

	Set<Entry<String,String>>m=map.entrySet();
	System.out.println("HashMap Before Remove :");
	for(Entry<String,String>m1:m){
		String k=m1.getKey();
		String v=m1.getValue();
	  System.out.println(k+" : "+v);
	  }
	  
System.out.println("HashMap After Remove :");
map.remove("ONE");
map.remove("FOUR");
Set<Entry<String,String>>m2=map.entrySet();
for(Entry<String,String>it:m2) {
	String result=it.getKey()+" : "+it.getValue();
System.out.println(result);
	}

}}
