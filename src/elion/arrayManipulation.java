package elion;

public class arrayManipulation {
	public int largest(int[] array) {
		int largest=array[0];
		
		for(int i=0;i<array.length; i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	int smallest(int[]array) {
		int smallest=array[0];
		for(int num:array) {
			if(num<smallest) {
				smallest=num;
			}
		}
		return smallest;
		
	}
	
	private static int findAverage(int[]array) {
		int sum=0;
		int length=array.length;
		for(int num:array) {
			
			sum+=+num;
			   
			
		}int average=sum/length;
		return average;
		
	}
	

	public static void main(String[] args) {
		int [] arr= {5,2,9,6,1,8};
		arrayManipulation manip=new arrayManipulation();
		int largest=manip.largest(arr);
		System.out.println("largest is "+largest);
		System.out.println(findAverage(arr)+" Average");

	}

}
