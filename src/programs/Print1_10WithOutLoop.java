package programs;

public class Print1_10WithOutLoop {
  
	public static void main(String []atgs) {
		/*int number=1;
		printNumbers(number);
	}
	
	public static void printNumbers(int num) {
		{
			if(num<10) {
				System.out.print(num+" ");
				printNumbers(num+1);
			}
		}
		*/
		
		int number=1;
		withoutLoop(number);
	}
		
		public static void withoutLoop(int num) {
			if(num<=10)
			{
				System.out.print(num+" ");
				withoutLoop(num+1);
				
			}
		}
	//}
	
	
	
}
