package pattern;


public class Hpatern {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		
		if(i==3) {
			for (int j = 0; j < 4; j++) {
				
			
			System.out.print("*");
			}
		}
		
		
			for (int j = 0; j < 3; j++) {
		
			if(i==0 || i==4) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		//	System.out.println("");
		}
		System.out.println();
	}
	
}
}
