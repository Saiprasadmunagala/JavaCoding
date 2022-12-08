package StringPrograms;

import java.util.LinkedHashSet;

public class OccurenceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome to bangalore and welcome to testyantra";
		String[] sp = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) {
			set.add(sp[i]);
		}
		for (String word : set) {
			int count=0;
			for (int i = 0; i < sp.length; i++) {
				if(word.equals(sp[i])) {
					count++;
				}
			}
			System.out.println(word+" "+count);
		}

	}

}
