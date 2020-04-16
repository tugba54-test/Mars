package replit;

public class Main implements Functions,padisahgul{
	double result;
	double firstNumber;
    double secondNumber;
	  public double adding(double firstNumber, double secondNumber){
		    return result=firstNumber+secondNumber;
		  }
		  public double subtracting (double firstNumber, double secondNumber){
		    return result=firstNumber-secondNumber;
		  }
		  public double multiply(double firstNumber, double secondNumber){
		    return result=firstNumber*secondNumber;
		  }
		  public double dividing (double firstNumber, double secondNumber){
		    return  result=firstNumber/secondNumber;
		  }
		  public void display(){
		    System.out.println(" Result is ::: "+result);
		  }

		  public static void main (String [] args){
		    
		  Main a=new Main();
		  a.adding(100, 20);
		  a.display();
		  }
		@Override
		public void display(String a) {
			// TODO Auto-generated method stub
			
		}
		}


