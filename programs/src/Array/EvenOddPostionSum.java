package Array;

public class EvenOddPostionSum {

	public static void sum(int arr[]) {
		
		int esum=0;
		int osum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				esum=esum+arr[i];
			}else {
				osum=osum+arr[i];
			}
		}
		
		System.out.println("even sum"+ esum);
		System.out.println("odd index"+ osum);
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		sum(a);
	}
}
