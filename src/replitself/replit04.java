package replitself;

public class replit04 {

	public static void main(String[] args) {
//		Print out the following pattern:
//			*
//			**
//			***
//			##
//			#
		
	    for(int i=1;i<=3;i++){
	      for(int j=1;j<=i;j++){
	        System.out.print("*"+"  ");
	        
	      }System.out.println();
	    }
	    for(int i=2;i>=1;i--) {
	    	for(int y=1;y<=i;y++) {
	    		System.out.print("#");
	    	}System.out.println();
	    }
	}

}
