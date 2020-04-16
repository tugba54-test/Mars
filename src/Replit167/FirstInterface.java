package Replit167;

public interface FirstInterface {
	void firstMethod();
	

}
 interface SecondInterface {
	void secondMethod();
	

}
class Main1 implements FirstInterface,SecondInterface{

	@Override
	public void firstMethod() {
System.out.println("First Method implementing multiple Inheritance"); 
				
	}

	@Override
	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance"); 
		
	}
		
}