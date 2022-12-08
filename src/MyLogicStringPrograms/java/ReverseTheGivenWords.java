package MyLogicStringPrograms.java;

public class ReverseTheGivenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this is test yantra";  //o/p :- siht si tset artnay
		String [] s=str.split(" ");
		for (int i = 0; i < s.length; i++)
		{
			
				String st=s[i];
				for (int j = st.length()-1; j >=0; j--) {
					System.out.print(st.charAt(j));
				}
				System.out.print(" ");
			}
				
			}
			

	

}
