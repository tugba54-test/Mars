package master;

public class Reply84 {

	public static void main(String[] args) {
		// Write a program that prints the total number of
		//elements that are negative AND odd cevap=3
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int y=0;y<a[i].length; y++) {
				if(a[i][y]<0 && a[i][y]%2!=0){
					sum+=y;
					
				}
				
		}
			

	}
		System.out.println(sum);
	

}
}