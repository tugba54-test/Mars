package replitself;

import java.util.HashSet;

public class Replit189 {

	public static void main(String[] args) {
		// Create the HashSet with list of Integers add the below numbers for the list
//		3 tane 111
//		3 tane 999
//		
		HashSet<Integer> hset = new HashSet<Integer>();
	      hset.add(111);
	      hset.add(111);
	      hset.add(111);
	      hset.add(999);
	      hset.add(999);
	      hset.add(999);
	      System.out.println(hset);
	      System.out.println("enhanced loop---");
		for(int n:hset) {
			System.out.println(n);
		}
	}

}
