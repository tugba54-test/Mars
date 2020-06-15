package Exam26;


interface Readable{
	public void readBook();
	public void setBookmark();
}
abstract class Book implements Readable{//abstract olmasaydi butun metodlari implement etmemiz gerekirdi
	public void readBook() {
		
	}
	public abstract void setBookMark();
	
}
class EBook extends Book{//if we add abstract here we can not create object

	@Override
	public void setBookmark() {
		// TODO Auto-generated method stub
		
	}
	public void setBookMark() {}//this class has to implement all abstact methods
}
public class S47 {
public static void main(String[] args) {
	Book book1= new EBook();
	book1.readBook();
}
}