package MyLogicStringPrograms.java;

import java.util.LinkedHashSet;

public class OrderOfOccurenceOfNumWithOunDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {4,1,1,2,2,3};
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		for (Integer in : set) {
			
			for (int i = 0; i < a.length; i++) {
				if(in==a[i]) {
					System.out.println(in+" : is present in : "+(i+1)+" : position");
					break;
				}
			}
		}


	}

}
