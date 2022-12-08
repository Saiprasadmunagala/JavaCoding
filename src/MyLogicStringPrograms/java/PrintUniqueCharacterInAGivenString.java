package MyLogicStringPrograms.java;

import java.util.LinkedHashSet;

public class PrintUniqueCharacterInAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="saiprasad";
		char[] s1 = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s.charAt(i));
			for (Character ch : set) {
				
			int count = 0;
			for (int j = i+1; j < s.length(); j++) {
				if(ch==(s.charAt(i))) {
					count++;
					
			}
			
			}
			if(count==1) {
				System.out.println(ch+" "+count);
				}
			}
		}
	}
	
	

}
