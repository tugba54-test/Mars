package Replit132;

public class Main1 {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}

class A {
	int i; 

	void display1(int i) {
		this.i=i;
		System.out.println(i);
	}

}

class B extends A {
	int i;

	void display() {
		
		System.out.println(i);
		System.out.println(super.i);

	}

	public void display() {
		// TODO Auto-generated method stub

	}
}
