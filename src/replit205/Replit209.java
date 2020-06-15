package replit205;

public class Replit209 {

	public static void main(String[] args) {
		try {
	
		temperatureCheck(29);
		}catch (RuntimeException ae) {
			System.out.println(ae);
			
		}

	}

	public static void temperatureCheck(int temperature) {

		if (temperature < 32) {
			throw new RuntimeException("It is freezing");
		
			
			
		}
			
		
	}
}