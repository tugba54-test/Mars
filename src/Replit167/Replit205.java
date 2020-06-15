package Replit167;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Replit205 {

	public static void main(String[] args) {
		List<Map<String,Object>>dataList=new ArrayList<>();
	Map<String,Object>apple=new LinkedHashMap<>();
	apple.put("Items", "Apple");
	apple.put("Price", 20.00);
	apple.put("Quantity", 10);
	
	dataList.add(apple);
	
	Map<String, Object> orange=new LinkedHashMap<>();
	orange.put("Items", "Orange");
	orange.put("Price", 21.99);
	orange.put("Quantity", 10);
	
	dataList.add(orange);
	//Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
	double totalPurchase=0.0;
	for(Map<String, Object> e:dataList) {
		double price=(double)(e.get("Price"));
		double quantity=(int)(e.get("Quantity"));
		double subTotal=price*quantity;
		System.out.println("Items: "+e.get("Items")+" Price: "+price+" Quantity: "+quantity+" SubTotal: "+subTotal);
		totalPurchase+=subTotal;
	}
	System.out.println("Your purchase total is "+totalPurchase);
		
	
	

	}

}
