package Array;

public class SubArrayWithLargestSum {

	public int maxSubArray(int arr[]) {
		
		int sum=0;
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			max=Math.max(max, sum);
			
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		
		SubArrayWithLargestSum a=new SubArrayWithLargestSum();
		
		System.out.println(a.maxSubArray(arr));
		
	}
}
