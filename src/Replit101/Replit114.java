package Replit101;

 class Replit114 {
	void space() {
		String word="hello";
	
		for(int i=0;i<word.length();i++) {
			System.out.print(word.charAt(i)+" ");
		}
		System.out.println();
	}
	void text() {
		
		String text="technology";
		for(int i=0;i<text.length();i++) {
			
			System.out.print(text.charAt(i)+" ");
		}
	}

	public static void main(String[] args) {
		// return: a String
//		Name:spaceOut
//		Parameters:a String
//		Then complete the method by programming the following behavior
//			Insert spaces after every character in the String s, then return the new string.
//			See below examples (note the space at the end as well).
//          Examples:
//			spaceOut("hello") ==> "h e l l o "
//			spaceOut("technology") ==> "t e c h n o l o g y "
		Replit114 str=new Replit114();
		str.space();
		str.text();
	
		
		
		
	}

}
