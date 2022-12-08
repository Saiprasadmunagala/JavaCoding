package StringPrograms;

import java.util.Iterator;

public class PrintUniqueCharacterInAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s="saiprasad";
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j) && i !=j){
					count++;
					break;
				}
			}
			if(count==0) {
			System.out.print(s.charAt(i)+" ");
			}
		}*/
		
		
		String s="Sai prasad";
		for (int i = 0; i < s.length(); i++) {
			String s1="";
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i)==s1.charAt(j)) {
					s1=s1+s.charAt(i);
				}
			}
			System.out.println(s1);
		}
	}

}
