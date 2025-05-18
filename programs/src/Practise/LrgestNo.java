package Practise;

public class LrgestNo {

	public static int arry(int num[]) {
		
		int temp=num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>temp) {
				temp=num[i];
			}
		}
		return temp;
		
	}
	public static void main(String[] args) {
		
		int arr[]= {1,4,6,7,8,9};
		
		System.out.println(arry(arr));
	}
}
