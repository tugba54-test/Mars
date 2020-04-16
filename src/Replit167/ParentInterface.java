package Replit167;

public interface ParentInterface {
	  void  parentMethod();
	
	    
}
interface ChildInterface extends ParentInterface{
 void childMethod();
 void  parentMethod();
}
class Main3 implements ChildInterface {
	   public void  parentMethod(){
	     System.out.println("Parent Method-welcome to Syntax");}

	     public void childMethod(){
	   System.out.println("hello to Syntax");
	}
	  
	  
	}

