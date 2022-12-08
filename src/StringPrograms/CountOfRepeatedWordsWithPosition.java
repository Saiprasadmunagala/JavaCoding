package StringPrograms;

import java.util.LinkedHashSet;

public class CountOfRepeatedWordsWithPosition {
	public static void main(String[] args) {
		
	
	String str="welcome to bangalore welcome to test yantra";
	String[] sp=str.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i <sp.length; i++) {
		set.add(sp[i]);
	}
		for (String stri : set) {
			
			int count = 0;
		for (int i = 0; i < sp.length; i++) {
			if(sp[i].equalsIgnoreCase(stri)) {
				count++;
				System.out.println(stri+" "+(i+1)+" "+(count));
				break;
					}
			
		

		}
		
	}
	
}

}
