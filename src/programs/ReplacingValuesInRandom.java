package programs;

import java.util.Scanner;

public class ReplacingValuesInRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[]= {10,20,30,40,50};   // 30,40,50,10,20
	
	Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
	

		for (int i = 0; i < key; i++) {
			
			int temp=a[0];
			for (int j = 1; j < a.length; j++) {
				a[j-1]=a[j];
				
			}
			a[a.length-1]=temp;
		}


		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
	}

}
