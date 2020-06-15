package HalimeIntrview;

public class fizzBuzz {
//	  Print numbers Start to End,
//	  When number is multiple of 3, print Fizz,
//	  When number is multiple of 5, print Buzz,
//	  When number is multiple of 3 and 5, print FizzBuzz,
//	  Else print the number.

	public static void Fizz(int start, int end) {

						if (start > end) {
							start = start + end;// a=32
							end = start - end;// b=12
							start = start - end;}
						
							for (int i = start; i <= end; i++) {
									
							
						if(i % 3 == 0) {
								System.out.print(i + "  ");
							}
						}
					}
				
	

	public static void Buzz(int start, int end) {
		if (start > end) {
			start = start + end;// a=32
			end = start - end;// b=12
			start = start - end;}
		
			
			for (int i = start; i <= end; i++) {
	
					
				
					if(i % 5 == 0) {
						System.out.print(i + "  ");
					}
				}}
			
		
	

	public static void FizzBuzz(int start, int end) {
		
			if (start > end) {
				start = start + end;// a=32
				end = start - end;// b=12
				start = start - end;}
				for (int i = start; i <= end; i++) {
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.print(i + "  ");
					}
				}
			}
		
	

	public static void main(String[] args) {
		System.out.println("---------Fizz------------");
		Fizz(-50, -10);
		System.out.println("-------Buzz--------");
		Buzz(90, 51);
		System.out.println("----------FizzBuzz----");
		FizzBuzz(120, 90);
	}
}