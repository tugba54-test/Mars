package Interview;

public class PrimeSerhanabi {
	public static void main(String[] args) {
		

	for(int i=2;i<101;i++) {
		   
        
        boolean primeNum=true;
       
       
        for (int k = 2; k < i; k++) {
            if (i % k == 0) {
               
              primeNum=false;
                break;
            }
       
        }
       
        if(primeNum) {
            System.out.print(i+" ");
           
            }
	}
}}