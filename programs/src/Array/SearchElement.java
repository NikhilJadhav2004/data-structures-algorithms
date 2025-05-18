package Array;

public class SearchElement {

	public static int isTarget(int arr[],int k) {
		
		int target=k;
		
		for(int i=0;i<arr.length;i++) {
           
			if(arr[i]==target) {
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
	
		int k=3;
		System.out.println(isTarget(a, k));
	}
}
