package elion;

public class Baby {
	String firstname;
	String lastname;
	char gender;
	int weight;
	String haircolor;

	public void walk() {
		System.out.println("Crawling....");
	}

	public String cry() {

		return "cry every minute...";
	}

	void talk(int times) {
		for (int i = 0; i <= times; i++) {

			System.out.println(" bla bla bla..");
		}
	}

	public void displayinfo() {
		System.out.println("full name is  " + firstname + " " + lastname);
		System.out.print("Gender is " + gender);
		if (gender=='M') {
			System.out.println("boy");
		}else if(gender=='F') {
			System.out.println("Girl");
		}else {
			System.out.println("unknown");
		}
		System.out.println("Hair color is " + haircolor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby baby1 = new Baby();
		baby1.cry();
		baby1.firstname = "jhon";
		baby1.lastname = "smith";
		baby1.gender = 'M';
		baby1.weight = 7;
		baby1.haircolor = "yellow";

		System.out.println("baby first name is " + baby1.firstname);
		baby1.cry();
		baby1.talk(3);
		
		
		Baby baby2=new Baby();
		baby2.firstname="selin";
		baby2.lastname="atasoy";
		baby2.gender='F';
		baby2.weight=6;
		baby2.haircolor="black";
		System.out.println("Baby 1");
		baby1.displayinfo();
		System.out.println("Baby 2");
		baby2.displayinfo();
	}

}
