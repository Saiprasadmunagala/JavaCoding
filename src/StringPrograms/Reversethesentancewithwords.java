package StringPrograms;

public class Reversethesentancewithwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="this is test yantra";  //o/p :- yantra test is this 
		String [] word=s.split(" ");
		for (int i = word.length-1; i >=0; i--) {
			
			System.out.print(word[i]+ " ");
			
		}
	}

}
