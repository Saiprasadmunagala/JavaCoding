package StringPrograms;

public class SegrigateAlphaNumAndSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="skk@#kjnR%&*ijsn125";//op :- skkkjnRijsn 125 @#%&*
		String alpha=" ";
		String num=" ";
		String spc=" ";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') {
				alpha=alpha+s.charAt(i); // skkkjnRijsn
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);  // 125
			}
			else {
				spc=spc+s.charAt(i);  // @#%&*
				}
			}
		
		System.out.println(alpha+num+spc);
			System.out.println("Characters is :"+alpha);
			System.out.println("Numbers is :"+num);
			System.out.println("Special characters is :"+spc);

	}
	
}
