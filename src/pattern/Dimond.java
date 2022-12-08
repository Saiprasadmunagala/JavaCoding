package pattern;

public class Dimond {
public static void main(String[] args) {
	int n=5;
	for (int i = 0; i < n; i++) {
		for (int j = i; j < n; j++) {
			System.out.print("  ");
			
		}
		for (int j = 0; j <=i; j++) {
			System.out.print("* ");
			
		}
		for (int j = 0; j < i; j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
	for (int i = 1; i <= n; i++) {
		if(i==1) {
		}else {
		for (int j = 1; j <= i; j++) {
			System.out.print("  ");
		}
		for (int j = i; j <= n; j++) {
			System.out.print("* ");
		}
		for (int j = i+1; j <=n ; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}}
	
}
}