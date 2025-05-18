package Array;

import java.util.HashMap;

import java.util.Map;

public class FindOccuranceOfEachElement {

	public static Map Ocurrance(int arr[]) {
		
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		return map;
	}
	public static void main(String[] args) {
		
		int arr[]= {2,1,3,2,1};
		System.out.println(Ocurrance(arr));
		
	}
}
