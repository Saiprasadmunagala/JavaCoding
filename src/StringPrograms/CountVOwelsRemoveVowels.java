package StringPrograms;

import java.util.Iterator;

public class CountVOwelsRemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] s="saiprasad".toCharArray();
		String s2 = "saiprasad";
		int count=0;
		String s1=s2.replaceAll("[aeiou]", "");
		for (int i = 0; i < s.length; i++) {
			
				if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u') {
					
					count++;
				}
			}
			System.out.println("No.of vowels is : "+count);
			System.out.println("after removing the vowels is : "+s1);
		
		

	}

}
