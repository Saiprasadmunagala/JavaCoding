package MyLogicStringPrograms.java;

public class SegrigateNumAndCalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{	String s="a1b3d4";
		String Char="";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			String s1=String.valueOf(s.charAt(i));
			if(s.charAt(i)>'0' && s.charAt(i)<='9') {
				int in=Integer.parseInt(s1);
				sum=sum+in;
			}
			
		}
		System.out.println(sum);
		}
		
		
		
		{	String s="a12bc11";
		String Char="";
		String num="";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>'0' && s.charAt(i)<='9') {
				int in=s.charAt(i)-48;
				Char=Char+s.charAt(i);
				
			}else {
				num=num+" ";
			}
			
		}
		System.out.println(Char);
		}
		
		
		
		
		
		

	}

}
