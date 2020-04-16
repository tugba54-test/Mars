package replit;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		
   ArrayList<Food>yemek=new ArrayList();
   
   yemek.add(new Soup());
   yemek.add(new Kebap());
   yemek.add(new Chicken());
   yemek.add(new Aspragus());
   //regular
   for(int i=0;i<yemek.size();i++) {
	   yemek.get(i).boil();
	   yemek.get(i).cook();
	   yemek.get(i).grill();
	   System.out.println("---------------");
   }
   // enhanced advanced
   for(Food f:yemek) {
	   f.boil();
	   f.cook();//run time polymorhism
	   f.grill();
	   System.out.println("----------------");
   }
  // iterator 
   Iterator<Food>f=yemek.iterator();
   while(f.hasNext()) {
	   Food x=f.next();
	   x.boil();
	   x.cook();
	   x.grill();
	   System.out.println("--------------");
   }
	}

}
