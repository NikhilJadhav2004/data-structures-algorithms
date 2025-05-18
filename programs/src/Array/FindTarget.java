package Array;

public class FindTarget {

	public static int Target(int arr[],int target) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {12,45,67,89,90,99};
		int target=99;
		
		System.out.println(Target(arr, target));
		
		
	}
}
