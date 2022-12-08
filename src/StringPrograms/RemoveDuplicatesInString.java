package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		/*String str="Tester";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		System.out.println(set);

		
		
		
		
	/*	
		String s1="tester";
		char []b=s1.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < b.length; i++) {
			set.add(b[i]);
			System.out.println(set);
		}
		//System.out.println(set);
		
		
		*/
		
		
		
		String str1="Tester";
		String s1=str1.toLowerCase();
		LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			
			set1.add(s1.charAt(i));
			
		}
		for (Character ch : set1) {
			int count=0;
			for (int i =0; i < s1.length(); i++) {
				if(ch==s1.charAt(i)) {
					count++;
				}
				
			}
			if(count>1)  // (count==1)==>for non repeated
			{
			System.out.println(ch+" "+count);
			
			}
		
		
		
		}
		
		
	}

}
