package selfwork;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse the string
		String word="hayirli aksamlar";
		String reverse = null ;
		for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}System.out.print(reverse);
   System.out.println();
		String text="cok zormus bu java ya";
		String r="";
		for(int i=text.length()-1;i>=0;i--) {
			r=r+text.charAt(i);
		}System.out.println(r);
		String sentc="I love Java";
		char revers;
		for( int i=sentc.length()-1; i>=0; i--) {
			revers=sentc.charAt(i);
			System.out.print(revers);
		}


	}

}
