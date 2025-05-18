package Array;
import java.util.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDoublicate {
	 public static int[] removeDuplicates(int[] nums) {
	        
		    int i=0;
		    for(int j=1;j<nums.length;j++){
		        if(nums[j]!=nums[i]){
		            nums[i+1]=nums[j];
		            i++;
		        }
		    }
		    return Arrays.copyOf(nums,i+1);
		    }
	 //using  set
	 public static Set remove(int [] a) {
			
			Set<Integer> set=new LinkedHashSet<Integer>();
					
			
			for(int i=0;i<a.length;i++) {
				
				set.add(a[i]);
			}
			return set;
		}
	 public static void main(String[] args) {

			int arr[]= {1,2,3,4,5,5,6,6,9};
			
			int r[]=removeDuplicates(arr);
			System.out.println(Arrays.toString(r));
			System.out.println(remove(arr));
	}
}
