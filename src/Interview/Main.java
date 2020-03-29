package Interview;

public class Main {
	static String country="Morocco";
static String continent="Africa";
void display(){
  System.out.println(country+" located on "+continent+" continent");
}
static String surround(String s,String  b){
    String surround=s.replace(b,"("+b+")");
  
    return surround;
  }


static String surroundasel(String s, String search_term){
	
	return s.replace(search_term, "("+search_term+")");

}


public static void main(String[] args) {
  Main obj=new Main();
  obj.display();
	System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
	System.out.println(surround("technology","o"));
}

}
