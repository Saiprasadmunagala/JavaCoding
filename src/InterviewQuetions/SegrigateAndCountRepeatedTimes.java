package InterviewQuetions;

public class SegrigateAndCountRepeatedTimes {
	
	public static void main(String[] args) {
		// Wrong Logic
		String s="wwwwprreetrtw";
		int count=1;
		int tempCount=0;
		//String str=s.toString();
		
		for (int i = tempCount; i < s.length(); i++) {
			
			
				for (int j = 1; j < s.length(); j++) {
					if ((s.charAt(j))==(s.charAt(i))) {
						count++;
					}else {
						tempCount=j;
						break;
					}
					break;
				}
				
				
				System.out.print(s.charAt(i)+" "+ count); 
			
			
			
		}
		
	}
	
	
	
}
