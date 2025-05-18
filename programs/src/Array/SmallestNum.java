package Array;

public class SmallestNum {

	public static int smallno(int arr[]) {
		
		int small=arr[0];
		
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]<=small) {
				small=arr[i];
			}
		}
		return small;
	}
	public static void main(String[] args) {
		int arr[]= {1,1,1,1,2,2,3,3,9};
		System.out.println(smallno(arr));
	}
}
