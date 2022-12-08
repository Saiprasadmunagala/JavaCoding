package StringPrograms;

public class GetTheMinimumWordLengthInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"12","1234","123456","123","12345"};
		String minimumLength=s[0];

		for (int i = 0; i < s.length; i++) {
			if(minimumLength.length()>s[i].length()) {
				minimumLength=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(minimumLength.length()==s[i].length()) {
				System.out.println(minimumLength);
			}
		}

	}

}
