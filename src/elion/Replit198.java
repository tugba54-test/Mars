package elion;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Replit198 {

	
		
		
		
		  public static void main(String[] args) {
				Map<String,String>g=new TreeMap<>();
				g.put("1 item","apple");
				g.put("2 item","banana");
				g.put("3 item","pear");
				g.put("4 item","tomato");
				g.put("5 item","mango");
				g.put("6 item","kiwi");
				
				Set<String>groceries=g.keySet();
				for(String g1:groceries){
				  System.out.println("Key is "+g1+" and values is "+g.get(g1));
				  
				}

		}

	}


