package programs;

public class SeconderMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,60,30,20,40,50};
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			
		}
		System.out.println(a[1]);

	}
}