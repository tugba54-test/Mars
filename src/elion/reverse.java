package elion;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="i am studying to be a QA tester";
char[] array=name.toCharArray();
System.out.println(name);

for(int i=array.length-1;i>=0;i--) {
	
	System.out.print(array[i]);
}System.out.println();
String text="i have to study more";
System.out.println(text);
String reverse1="";
for(int i=text.length()-1;i>=0;i--) {
reverse1+=text.charAt(i);

	}System.out.println(reverse1);

	}
}
