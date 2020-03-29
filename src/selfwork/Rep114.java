package selfwork;

public class Rep114 {
	 private static final int Aa = 0;
	private static final int Ee = 0;
	private static final int Ii = 0;
	private static final int Uu = 0;

	static String spaceout(String a) {
	
		for(int i=0;i<a.length();i++) {
		System.out.print(a.charAt(i)+" ");
		}
		return a;
		
	}
	 static int countE(String s) {
		 int count=0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='E') {
				 count++;
			 }if(s.charAt(i)=='e') {
				 count++;
			 }
		 }
		return count;
		 
	 }
	 static int countvowels(String b) {
		 String str="";
		  str=str+b.replaceAll("[^Aa-Ee-Ii-Uu-Oo]", "");
		  int count=str.length();
		return count;
	 }
	
	
	static String mixstring(String a,String b) {
		String mixstring="";
		for(int i=0;i<a.length();i++) {
			mixstring=mixstring+a.charAt(i)+b.charAt(i);
			
		}
		return mixstring;
	}
	  static int countT(String str) {
			 int count=0;
			String [] ahmet=str.split("");
			for(int i=0;i<ahmet.length;i++) {
				if(ahmet[i].equalsIgnoreCase("t")) {
					count++; 
				}
			}
			return count;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rep114 obj=new  Rep114();
		 obj.spaceout("hello");
		 System.out.println(mixstring("hello","merhaba"));
  System.out.println(countT("tetatdte"));
  System.out.println(countE("ebele ubele"));
  System.out.println(countvowels("eoshansdkeou"));
	}

}
