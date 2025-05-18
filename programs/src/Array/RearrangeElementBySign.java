package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElementBySign {

	public static int[] isRearrange(int temp[]) {
		
		List<Integer> plist=new ArrayList<Integer>();
		List<Integer> nlist=new ArrayList<Integer>();
		for(int i=0;i<temp.length;i++) {
			
			if(temp[i]>0) {
				plist.add(temp[i]);
			}else {
				nlist.add(temp[i]);
			}
		}
		int arr[]=new int[temp.length];
		int k=0;
		int c=0;
		
		while(c<plist.size()) {
			arr[k]=plist.get(c);
			arr[k+1]=nlist.get(c);
			k+=2;
			c++;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		
		int a[]= {3,1,-2,-5,2,-4};
		System.out.println(Arrays.toString(isRearrange(a)));
	}
}
