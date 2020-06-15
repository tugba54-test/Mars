package Interview;

public class a2b4c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="aabbbbccccddd";
		
		String nonD="";
		for(int i=0;i<str.length();i++) {
			if(!nonD.contains(""+str.charAt(i))) {
				nonD+=str.charAt(i);
			}
		}
		
		System.out.println(nonD);
		String result="";
		
		
		
	}

}
