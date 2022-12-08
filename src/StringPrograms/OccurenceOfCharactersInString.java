package StringPrograms;

import java.util.LinkedHashSet;

public class OccurenceOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="saiprasad";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)==ch) {
					count++;
				}
			}
			System.out.println(ch +" "+count);
		}
			
		
	}

}
