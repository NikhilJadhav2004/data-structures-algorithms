package SortingAlgorithm;

public class SelectionSort {

	public static int[] swaping(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int a[]= {4,1,5,2,3};
		
		int b[]=swaping(a);
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
