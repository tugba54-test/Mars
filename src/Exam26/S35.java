package Exam26;

public class S35 {

	public static void main(String[] args) {
		int numbers[];
		numbers=new int[2];
		numbers[0]=10;
		numbers[1]=20;
		
		
		numbers=new int[4];
		numbers[2]=30;
		numbers[3]=40;

		
		numbers=new int[6];
		numbers[1]=15;
		numbers[2]=25;
		
		
		for(int x:numbers) {//artik 1.array i gormuyr onun  sadece en son yazdigini goruyr reassign ediyr
			System.out.println(x);//ve buna 0 ve 1 i eklemiyr onn icn ilk 2 si 0
			
			
		}

	}

}
