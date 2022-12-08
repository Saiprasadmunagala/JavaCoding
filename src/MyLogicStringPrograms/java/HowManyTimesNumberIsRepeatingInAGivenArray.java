package MyLogicStringPrograms.java;

import java.util.LinkedHashSet;

public class HowManyTimesNumberIsRepeatingInAGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {4,1,4,2,0,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer in : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(in==a[i]) {
					count++;
					
				}
				
				}
			 {
				System.out.println(in+" "+count);
			
				
			}
			
		}
	}
}
