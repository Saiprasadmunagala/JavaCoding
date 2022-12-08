package StringPrograms;

public class ReverseA_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="trster";  // o/p:- retsrt
		String rev="";
		for (int i = s.length()-1; i >= 0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.print(" "+rev);
		
		
		
		String s1="tester";
		for (int i = s1.length()-1; i >=0; i--) {
			System.out.print(" "+s1.charAt(i));
			
		}
		
		*/
		String s="tester";
		char[] str=s.toCharArray();
		for (int i = str.length-1; i >=0; i--) {
			System.out.print(" "+str[i]);
			
		}
	
	}

}
