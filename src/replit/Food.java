package replit;

public abstract class Food {
	public abstract void boil();
	public abstract void  cook();
	public abstract void grill();

}
class Soup extends Food{

	@Override
	public void boil() {
System.out.println("Soup can be boiled");		
	}

	@Override
	public void cook() {
System.out.println("soup can be boiled");		
	}

	@Override
	public void grill() {
System.out.println("Soup can not be grilled");		
	}
	
}
class Chicken extends Food{

	@Override
	public void boil() {
		System.out.println("Chicken  can be boiled");		
		
	}

	@Override
	public void cook() {
		System.out.println("Chicken  can be cook");		
		
	}

	@Override
	public void grill() {
		System.out.println("Chicken can be grilled ");		
		
	}
	
}
class Kebap extends Food{

	@Override
	public void boil() {
		System.out.println("Kebap can not  be boiled");		
		
	}

	@Override
	public void cook() {
		System.out.println("kebap can be cook");		
		
	}

	@Override
	public void grill() {
		System.out.println("kebap can be grill");		
		
	}
	
}
class Aspragus extends Food{

	@Override
	public void boil() {
		System.out.println("Aspagus  can be grill");		
	
	}

	@Override
	public void cook() {
		System.out.println("Aspagus  can be grill");		
		
	}

	@Override
	public void grill() {
		System.out.println("Aspagus  can be grill");		
		
	}
	
}