package StringPrograms;

public class CountNoOfVowelsPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="testyantra";
		char[] s=str.toCharArray();
		int count=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u') {
				count++;
			}
		}
		System.out.println("No of vowels are : "+count);
		
	}

}
