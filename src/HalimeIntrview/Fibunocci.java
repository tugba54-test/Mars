package HalimeIntrview;

public class Fibunocci {
public static void main(String[] args) {
		
		// 0  1  1  2 3  5 8  13  21...
	  // a  b  c
	 //    a  b  c
	 //	      a  b c c=a+b
		
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=0; i<10;i++) {
			System.out.print(a+" ");//0
			c=a+b;
			a=b;
			b=c;
			
			
		}
		
		
	}

}
