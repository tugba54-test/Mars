package elion;

public class MathOperation {
	public int add(int num1,int num2) {
		int addition=num1+num2;
		return addition;
	}
	public void add2(int num1,int num2) {
		int addition=num1+num2;
		System.out.println(addition);
	}
	protected void addnoReturn(int num1,int num2) {
		int addition=num1+num2;
		System.out.println("Printing the result "+addition);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation math=new MathOperation();
		System.out.println(math.add(4, 5));
		math.add2(4, 5);
		
		math.addnoReturn(5, 6);

	}

}
