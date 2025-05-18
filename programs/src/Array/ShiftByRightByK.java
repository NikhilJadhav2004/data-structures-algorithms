package Array;

public class ShiftByRightByK {

	public static void shift(int nums[],int k) {
	
		k=k%nums.length;
		swap(nums,0,nums.length-1);
		swap(nums,0,k-1);
		swap(nums,k,nums.length-1);
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
		
	}
	
	public static void swap(int nums[],int i,int j) {
		while(i<j) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
			
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		shift(arr, 10);
	}
}
