package Replit101;

public class Replit115 {
	
	String patates(String a,char a1) {
   
    String  text=a.replace(a1,'*');
   return text ;
		}
		
	public static void main(String[] args) {
		// Returns:a String
//		Name:censorLetter
//		Parameters:	a String,a char	
//      Then complete the method by programming the following behavior
//		Replace all instances of given character with a "*" within the given String.
//		See below examples.
//       Examples:
//		censorLetter("computer science",'e') ==> "comput*r sci*nc*"
//		censorLetter("trick or treat",'t') ==> "*rick or *rea*"
		Replit115 str=new Replit115();
		System.out.println(str.patates("computer science",'e'));
		System.out.println(str.patates("trick or treat",'t'));
		System.out.println(str.patates("iyi aksamlar turkiye",'i'));
	}

}
