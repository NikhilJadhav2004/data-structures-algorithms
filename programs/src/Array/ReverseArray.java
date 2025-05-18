package Array;

public class ReverseArray {

	public static  void reverse(int arr[]){
		System.out.println("--");
		int n=arr.length;
		System.out.println(n);
		for(int i=n-1;i>=0;i--) {
			
			System.out.print(arr[i]+ " ");
		}
		
		}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,5};
           reverse(a);	
           
	}
	
	
}
