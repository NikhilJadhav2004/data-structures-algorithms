package Array;

import java.util.Arrays;

public class MaximumDiffBetnElement {

	//return which diff is maximun type repited
	public  static int diff(int nums[]) {
		if(nums.length<2) {
			return 0;
		}
		Arrays.sort(nums);
		int difrance=Integer.MIN_VALUE;
		for(int i=1;i<nums.length;i++) {
			int a=nums[i]-nums[i-1];
			difrance=Math.max(difrance, a);			
		}
		return difrance;
			}
	public static void main(String[] args) {
		
		int arr[]= {5,6,7,2,5,9};
		System.out.println(diff(arr));
	}
}
