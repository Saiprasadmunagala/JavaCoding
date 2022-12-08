package StringPrograms;

public class SegrigateNumAndCalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="a1b3d4";
		String Char="";
		int sum1=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>'0' && s.charAt(i)<='9') {
				int in=s.charAt(i)-48;
				sum1=sum1+in;
			}
			
		}
		
		System.out.println("After Typecast from char to int : "+sum1);
		

	}

}
