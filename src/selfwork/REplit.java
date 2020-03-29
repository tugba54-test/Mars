package selfwork;

public class REplit {
static int countA(String s) {
	int count=0;

	String[] tugba=s.split("");
	for(int i=0;i<tugba.length;i++) {
		if(tugba[i].equalsIgnoreCase("a")) {
			count++;
	}  
		}return count;
	}
       static int countB(String str) {
    	   int count=0;
    	   String[] kubra=str.split("");
    	   for(int i=0;i<kubra.length;i++) {
    		   if(kubra[i].equalsIgnoreCase("b")) {
    			   count++;
    		   }
    	   }
		return count;
       }

	public static void main(String[] args) {
		// returns an integer
//		Name:countA
//		Parameters:a String called s
//			Purpose:count the number of occurrences of 'a' or 'A' within s
//			Examples:
//			countA("aaa") ==> 3
//			countA("aaBBdf8k3AAadnklA") ==> 6
	System.out.println(countA("aaa"));
	System.out.println(countA("aaBBdf8k3AAadnklA"));
	System.out.println(countB("abrakadabra"));
	System.out.println(countB("birberberbir berberi"));
	System.out.println(countD("denizde denizle oynarkene"));
	System.out.println( mixstring("12345","abcde"));
	System.out.println(mixstring("howdy","hello"));

	}
	static int countD(String gec) {
		String[] array=gec.split("");
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i].equalsIgnoreCase("d")) {
				count++;
			}
		}
		return count;
	}

	static String mixstring (String a,String b) {
		String mixstring="";
		for(int i=0;i<a.length();i++) {
			mixstring=mixstring+a.charAt(i)+b.charAt(i);
		}
		return mixstring ;
		
	}
}
