package programs;

public class GetMaximumLengthOfStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"hi","hello","one","four","killer",};
		
		int max=s[0].length();
		int min=s[0].length();
		
		for (int i = 0; i < s.length; i++) {

			if(max<s[i].length()) {
				max=s[i].length();
			}
			
			if(min>s[i].length()) {
				min=s[i].length();
			}
			
		}
		for (int j = 0; j < s.length; j++) {

			if(s[j].length()==max) {
				System.out.println(s[j]);
			}
		}
		for (int k = 0; k < s.length; k++) {
			if(s[k].length()==min) {
				System.out.println(s[k]);
				
			}
		}
	}
	
}
