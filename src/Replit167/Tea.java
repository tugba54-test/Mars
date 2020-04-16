package Replit167;

public  abstract class Tea {
	String teaType;
	Tea(String teaType){
		this.teaType=teaType;
		
	}
	abstract void addSugar();

}
class LemonTea extends Tea{

	LemonTea(String teaType) {
		super(teaType);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addSugar() {
System.out.println("For "+teaType+" we need 2 spoons of sugar");		
	}
	
}
class ChaiTea extends Tea{

	ChaiTea(String teaType) {
		super(teaType);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addSugar() {
System.out.println("For "+teaType+" we need 1 spoon of sugar");		
	}
	
}
