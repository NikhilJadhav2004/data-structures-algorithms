package Array;

public class SpanOfArray {

	public static void main(int[] arr) {
		
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(max-min);
	}
	public static void main(String[] args) {
		
		int[] array= {10,20,30};
		main(array);
		
	}
}
