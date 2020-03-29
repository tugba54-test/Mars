package Replit101;

public class Reply112 {
	 boolean bothEven(int c,int b) {
	boolean even;
		if(c%2==0 && b%2==0 ) {
			 even=true;
			
		}else {
		 even = false;
			
		}
		return even;
	}

	public static void main(String[] args) {
		// Create a method that will accept 2 numbers as parameters and return true 
		//if both numbers are even otherwise returned false
//		( Return false if one or both given numbers are not even)
//        Examples:
//		bothEven(4,6) ==> true
//		bothEven(3,4) ==> false
//		bothEven(-1,1) ==> false
//        Expected Output:false
		Reply112 str=new Reply112();
		System.out.println(str.bothEven(12, 11));
		

	}

}
