package Replit101;

public class Replit108 {
	int a;
	int b;
	void printTime(int hour, int minute){
	    System.out.println(hour+":"+minute);
	  }
	void number() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// 1. Create a method in which you will be printing numbers from 1 to 10
        //2. Call the method in the main method
		Replit108 obj=new Replit108();
		obj.number();
		obj.a=11;
		obj.b=30;
		System.out.println(obj.a+":"+obj.b);
		Main mm= new Main();
	    obj.printTime(11,30);



	}

}
