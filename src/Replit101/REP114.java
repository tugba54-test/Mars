package Replit101;

public class REP114 {
	 public static void main(String[] args) {
		 REP114 obj=new REP114();
				System.out.println(obj.spaceOut("hello"));
				System.out.println(obj.spaceOut("technology"));
			}
			
			String spaceOut(String str) {
				
				String newString="";
				
				for(int i=0; i<str.length(); i++ ) {
					newString=newString+str.charAt(i)+" ";
				}
				
				return newString;
			}
		}

}
