package master;

public class khffghh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int y=0;y<a[i].length;y++) {
				if(a[i][y]<0 && a[i][y]%2==0) {
					sum=sum+y;
			}
		}
		
	}
	System.out.println(sum);	
	}
}
