package Array;

public class OccuranceOfNum {

	public static int Occurance(int arr[], int element) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 1, 2, 2, 2 };
		int a = 2;
		System.out.println(Occurance(arr, a));
	}
}