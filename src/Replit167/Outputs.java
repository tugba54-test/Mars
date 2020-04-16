package Replit167;

public interface Outputs {
	 public void display();
	}
interface Functions extends Outputs{
	  double adding();
	  double subtracting();
	  double multiply();
	  double dividing();
	}
class Main4 implements Functions{
	double firstnumber ;
	double secondnumber ;
Main4(double firstnumber,double secondnumber){
	this.firstnumber=firstnumber;
	this.secondnumber=secondnumber;
}

	@Override
	public void display() {
		
		System.out.print("Result is ::: ");
	}

	@Override
	public double adding() {
		
		double result=firstnumber+secondnumber;
		return result;
	}

	@Override
	public double subtracting() {
		double result=firstnumber-secondnumber;
		return result;
	}

	@Override
	public double multiply() {
		double result=firstnumber*secondnumber;
		return result;
	}

	@Override
	public double dividing() {
		double result=firstnumber/secondnumber;
		return result;
	}
	
}

