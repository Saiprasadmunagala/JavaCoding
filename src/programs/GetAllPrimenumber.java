package programs;

public class GetAllPrimenumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,5,6,7,8,9,10,11};
		
		for (int i = 0; i < a.length; i++) {
			
			int n=a[i];
			int j=2;
			while(true) {
				
				if(n%j==0) {
					break;
				}
				else {
					j++;
				}
			
			}
			if(j==n) {
				System.out.print(a[i]+ " ");
			}
		}
		
		
	}

}
