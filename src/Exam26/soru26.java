package Exam26;

public class soru26{

 static int count=0;
int i=0;
public void changeCount() {
	while(i<5) {
		i++;
		count++;
	}
}
public static void main(String[] args) {
	
	soru26 check1=new soru26();
	soru26 check2=new soru26();
	check1.changeCount();
	check1.changeCount();
	System.out.println(check1.count+"  : "+check2.count);
}
}