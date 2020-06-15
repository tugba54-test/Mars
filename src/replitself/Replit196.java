package replitself;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Replit196 {

	public static void main(String[] args) {
		Map<String,String>c=new LinkedHashMap<>();
	    c.put("Street","Patrick ST");
	    c.put("Suite","265");
	    c.put("City","Vienna");
	    c.put("Zip","22180");
	    c.put("Country","United State");
	    System.out.println(c.size());
	    
	    Set<Entry<String, String>> AllEntries = c.entrySet();
	    
	    for (Entry<String,String> entr : AllEntries) {
			String val= entr.getValue();
	    
	    System.out.println(val);
	    }
	    
	    
	    
	    c.clear();
	   System.out.println(c.size());
	    
	    
	  }
	    
	  }
	  
	  
	  

	


