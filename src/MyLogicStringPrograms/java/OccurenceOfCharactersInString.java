package MyLogicStringPrograms.java;

public class OccurenceOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="saiprasad";
		String s3="saiprasad";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
			String s1 =""+ s.charAt(i);
			
			for (int j = i+1; j < s.length(); j++) {
				
				String s2 =""+ s.charAt(j);
				if(s1.equalsIgnoreCase(s2)) {
					s3.replace("[s]", "");
					count++;
				}
				
				
			}
			
			
		}
		System.out.print(count+" ");
		

	}

}
