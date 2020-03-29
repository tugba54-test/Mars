package Interview;

import java.util.Scanner;

public class Largestinterview {

	public static void main(String[] args) {
		// // Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		int[] nums = { 34, 56, 78, 234, 567, 987, 237, 456 };

		int smallest = nums[0];
		int largest = nums[0];
		int slargest = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			} else if (nums[i] < smallest) {
				smallest = nums[i];
			} else if (nums[i] > slargest) {
				slargest = nums[i];
			}

		}
		System.out.println("largest " + largest);
		System.out.println("slargest " + slargest);
		System.out.println("smallest " + smallest);

	}

}
