package com.numberSystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ArrayOcurrance {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int j=0;j<n;j++) {
			map.put(arr[j],map.getOrDefault(arr[j],0)+1);
		}
		
		Iterable< Entry<Integer, Integer>> entry=map.entrySet();
		
		for( Entry<Integer, Integer> i: entry) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
	}

}
