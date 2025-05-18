package Array;

import java.util.ArrayList;
import java.util.List;

public class PositiveNegativeArragmentInArray {

	public static int [] arraged(int num[]) {
		
		List<Integer> positive=new ArrayList<Integer>();
		List<Integer> negative=new ArrayList<Integer>();
		
		for(int i=0;i<positive.size();i++) {
			if(num[i]>0) {
				positive.add(num[i]);
			}
		}
		for(int j=0;j<negative.size();j++) {
			if(num[j]<0) {
				negative.add(num[j]);

			}
		}
		
		System.out.println(positive);
		System.out.println(negative);
		int arr[]=new int[num.length];
		int k=0;
		int c=0;
		
		while(c<positive.size()) {
			
			arr[k]=positive.get(c);
			arr[k+1]=negative.get(c);
			k+=2;
			c++;
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		int a[]= {3,1,-2,-5,2,-4};
		System.out.println(arraged(a));
	}
	
}
