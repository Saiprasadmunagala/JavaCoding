package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWordsInString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this is is test yantra"; //o/p:- this is  test yantra
		String[] s=str.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
			
		}
		for (String string : set) {
			System.out.print(string+" ");
		}
		
		
	}
	
}
