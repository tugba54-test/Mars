package master;

public class Reply812DLrgst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		int largest=a[0][0];
		for(int  i=0; i<a.length; i++) {
			for(int y=0;y<a[i].length;y++) {
			if (a[i][y]>largest) {
				largest=a[i][y];
			}
			}
			
		
		
			}
		System.out.println(largest);
		}

}



	


