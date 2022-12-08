package StringPrograms;

public class SwapWordsInASentance {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		
		String str="this is test yantra";
		String[] s=str.split(" ");
		
		String temp=s[0];//temp=this
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
			
		}*/
		
		 int n=5;
         for(int i=1;i<=n;i++){
             
             for(int j=i;j<=n;j++){
                 System.out.print("  ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("* ");
             }
             
             for(int j=1;j<i;j++){
                 System.out.print("* ");
             }
            System.out.println();
             
             
         }
		
	}
	
}
