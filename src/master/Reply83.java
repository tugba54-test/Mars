package master;

public class Reply83 {

	public static void main(String[] args) {
		// For you to do:
		//Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

		//For example, if we run rowSums for the following 2D array:
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
	
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int y=0;y<a[0].length;y++) {
				sum=sum+a[i][y];
			}
			System.out.println(sum);
		}
			
			

		}

}
