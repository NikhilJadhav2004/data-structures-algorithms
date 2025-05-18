package ArrayHashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.*;

public class FIndOccuranceEachNo {

	public static void main(String[] args) {
		
		int arr[]= {10,5,10,15,10,5};
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int element:arr) {
			if(map.containsKey(element)) {
				
				map.put(element, map.get(element)+1);
				//System.out.println(map.get(element));
			}else
			{
				map.put(element,1);
			}
		}
		
		for(java.util.Map.Entry<Integer, Integer> set:map.entrySet()) {
			
			System.out.println(set.getKey()+" "+set.getValue());
		}
	}
}
