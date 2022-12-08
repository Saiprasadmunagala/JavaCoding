package StringPrograms;

import java.util.LinkedHashSet;

public class CountNoOfVowelsPresentInStringByRemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="testyantra";
		char[] s=str.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		int count = 0;
		for (Character ch : set) {
			
			
			
				if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u') {
					count++;
					

				}
			}
			System.out.println(str+ " "+count);

		


	}

}
