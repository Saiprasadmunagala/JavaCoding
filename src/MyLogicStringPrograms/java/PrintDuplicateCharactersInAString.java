package MyLogicStringPrograms.java;

import java.util.LinkedHashSet;

public class PrintDuplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Saiprasad";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
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
			System.out.print(ch+" "+count);
		}

	}

}
