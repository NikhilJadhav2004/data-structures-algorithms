package Array;
public class ArrayIsSorted {

	public static boolean check(int[] nums) {
        
	     for(int i=1;i<nums.length;i++){
	        if(nums[i]>=nums[i-1]){

	        }
	        else{
	            return false;
	        }
	    }
	    return true;
	    }
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,5,6,6,9};
		
		System.out.println(check(arr));
	}
}
