package SortingAlgorithm;

public class BubbleSort {

	
	public static int[] sorting(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		
		int a[]= {4,1,5,2,3};
		
		int b[]=sorting(a);
		
		for(int element:b) {
			System.out.println(element);
		}
	}
}
