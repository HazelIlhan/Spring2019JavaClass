package day24;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] nums = new int[50];

		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));

		for (int x = 0; x < 50; x++) {
			// 0- 100-1
			nums[x] = rand.nextInt(10);

		}
		//System.out.println(rand.toString());

	System.out.println(Arrays.toString(nums));
	//for (int x = 0; x < 10; x++) {    ///other option to print 
	//System.out.println(nums[x]);
	}

}
