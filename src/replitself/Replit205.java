package replitself;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Replit205 {
	public static void main(String[] args) {
		// Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		Map<String, Object> apple = new LinkedHashMap<String, Object>();
		apple.put("Items", "Apple");
		apple.put("Price", 20.00);
		apple.put("Quantity", 10);
		
			dataList.add(apple);

			
		
		
			Map<String, Object> orange = new LinkedHashMap<String, Object>();
			orange.put("Items", "Orange");
			orange.put("Price", 21.99);
			orange.put("Quantity", 10);
			
			dataList.add(orange);
			
			double Purchasetotal=0;
			for(Map<String,Object>map:dataList) {
				String items=map.get("Items").toString();
				
				double price=Double.parseDouble(map.get("Price").toString());
				double quantity=Double.parseDouble(map.get("Quantity").toString());
                double lineTotal=price*quantity;
				
				System.out.println("Items: "+items+" Price: "+price+" Quantity: "+quantity+"SubTotal: "+lineTotal);
				Purchasetotal+=lineTotal;
				
				
				
			}
			System.out.println("Your Purchase total "+Purchasetotal);
	}}
			
			

		
		
		
		
		
		

	




