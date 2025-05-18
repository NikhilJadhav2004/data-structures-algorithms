package Array;

import java.util.ArrayList;
import java.util.List;

public class IndexArrangment {

	
	public static List isDiv3And5(int num) {
		
		List<String> ans=new ArrayList<String>();
		for(int i=1;i<=num;i++) {
			
			if(i%3==0 && i%5==0 ) {
				ans.add("FizzBuzz");
			}else if(i%3==0) {
				ans.add("Fizz");
			}else if(i%5==0) {
				ans.add("Buzz");
			}else {
				ans.add(""+i);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int a=15;
		System.out.println(isDiv3And5(a));
	}
}
