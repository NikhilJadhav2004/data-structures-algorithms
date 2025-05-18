package Array;
import java.util.*;

public class IntersectionOfTwoArray {
	
public static List intersection(int arr1[],int arr2[]) {
	
	List<Integer> list=new ArrayList<Integer>();
	int i = 0,j=0;
	while(i<arr1.length && j<arr2.length) {
		
		if(arr1[i]<arr2[j]) {
			i++;
		}else if(arr2[j]>arr1[i]) {
			j++;
		}else {
			list.add(arr1[i]);
			i++;
			j++;
		}
	}
	return list;
}
public static void main(String[] args) {
	int a[]= {1,2,2,1};
	int b[]= {2,2};
	System.out.println(intersection(a, b));
	Scanner sc=new Scanner(System.in);
}
	
}
