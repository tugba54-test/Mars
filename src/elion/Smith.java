package elion;

public class Smith extends JameMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JameMember obj=new JameMember();
		
		obj.firstName="Lebron";
		obj.lastname="James";
		obj.age=34;
		obj.display();
		System.out.println(obj.firstName);
		JameMember obj1=new JameMember();
		obj1.display();

	}

}
