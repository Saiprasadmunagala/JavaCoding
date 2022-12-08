package programs;

import java.util.ArrayList;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcba";
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println(rev);
		}
		
	}

}
