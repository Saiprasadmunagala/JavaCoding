package programs;

public class FirstMaxWithOutBublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,30,10,50,40};
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println(max);

	}

}
