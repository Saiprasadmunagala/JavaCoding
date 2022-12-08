package StringPrograms;

public class GetTheMaximumWordLengthInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"hi","hello","welcome","bye","i"};
		String maximumLength=s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(maximumLength.length()<s[i].length()) {
				maximumLength=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(maximumLength.length()==s[i].length()) {
				System.out.println(maximumLength);
			}
		}
		
	}

}
