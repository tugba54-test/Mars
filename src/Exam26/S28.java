package Exam26;

public class S28 {

	public static void main(String[] args) {
		String ta="A";
		ta=ta.concat("B");
		String tb="C";
		ta=ta.concat(tb);
		ta.replace('C','D');//esittr olmadigi icn atama yapilamis
		ta=ta.replace('d','k');//d harfi olmadigi icn etkilemiyr
		ta=ta.concat(tb);
		System.out.println(ta);
				

	}

}
