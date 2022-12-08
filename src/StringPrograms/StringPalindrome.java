package StringPrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mom";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println(s+ " : yes it is a palindrome");
		}
		else {
		System.out.println(s +" : it is not a palindrome");
		}

	}

}
