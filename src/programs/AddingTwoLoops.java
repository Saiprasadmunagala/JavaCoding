package programs;

public class AddingTwoLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6,};
		int b[]= {3,7,9};
		
		
		int addnum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j <= b.length; j++) {
				
				if(i==j) {
					addnum=a[i]+b[j];
					
				}
			
		}
			System.out.print(addnum+" ");

	}
}

}
