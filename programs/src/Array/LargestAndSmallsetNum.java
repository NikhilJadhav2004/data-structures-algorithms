package Array;

public class LargestAndSmallsetNum {

	public void array(int arr[]) {
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		LargestAndSmallsetNum num=new LargestAndSmallsetNum();
		num.array(a);
		
	}
}
