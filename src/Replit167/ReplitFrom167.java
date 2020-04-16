package Replit167;

public class ReplitFrom167 {

	public static void main(String[] args) {
Tea lmn=new LemonTea("Lemon tea");
lmn.addSugar();
Tea ch=new ChaiTea("Chai tea");
ch.addSugar();

MyInterface m=new Main();
m.method1();
m.method2();

//soru 169
FirstInterface m1=new Main1();
m1.firstMethod();
SecondInterface m2=new Main1();
m2.secondMethod();

ChildInterface b=new Main3();
b.parentMethod();
ChildInterface c=new Main3();
c.childMethod();

Main4 mn=new Main4(100.00,20.00);
System.out.println("Result is ::: "+mn.adding());
System.out.println("Result is ::: "+mn.subtracting());
System.out.println("Result is ::: "+mn.multiply());
System.out.println("Result is ::: "+mn.dividing());



EncapsulatonDemo em=new EncapsulatonDemo();
em.setEmpName("John");
System.out.println("Employee Name : "+em.getEmpName());
em.setEmpAge(30);
System.out.println("Employee Age : "+em.getEmpAge());



EncapsulationDemo3 emp=new  EncapsulationDemo3();
emp.setEmpName("Mario");
emp.setEmpAge(32);
System.out.println("Employee Name: "+em.getEmpName());
System.out.println("Employee Age : "+em.getEmpAge());

//John
//Doe
//10/25/1900
//123-45-6789
Person p=new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
System.out.println(p.getFirstname());
System.out.println(p.getLastname());
System.out.println(p.getBirthmonth()+"/"+p.getBirthday()+"/"+p.getBirthyear());
System.out.println(p.getSsn());



	}

}
