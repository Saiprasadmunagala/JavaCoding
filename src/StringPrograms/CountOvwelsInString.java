package StringPrograms;

public class CountOvwelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s1="saiprasad".toCharArray();
		
		int count=0;
		

		for (int i = 0; i < s1.length; i++) {
			
			if(s1[i]=='a'|| s1[i]=='e' || s1[i]=='i' || s1[i]=='o'|| s1[i]=='u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
