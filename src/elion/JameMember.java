package elion;

public class JameMember {
	String firstName;
	 static String lastname;
	int age;
	
	void memberFullName() {
		System.out.println("Full name is "+firstName+" "+lastname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JameMember obj=new JameMember();
		obj.firstName="Lebron";
		obj.lastname="James";
		obj.age=34;
		
		JameMember obj1=new JameMember();
		obj1.firstName="Savannah";
		obj1.lastname="James";
		obj1.age=28;
		
		
		obj.memberFullName();
		obj1.memberFullName();
	}

}
