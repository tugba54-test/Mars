package toString;

public class toImmutable{
	private int month;
	private int day;
	private int year;
	
	public toImmutable(int m,int d,int y) {
		month=m;
		day=d;
		year=y;
		System.out.printf("The constructor for this is %s\n", this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month,day,year);
		
	}
	//https://www.youtube.com/watch?v=ZBkyPA6NZR8&list=PLFE2CE09D83EE3E28&index=43
	//devami icn adres
}