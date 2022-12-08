package MyLogicStringPrograms.java;

public class OddEvenUsingTernary {

	public static void main(String[] args) {
		
		int arr [] ={1, 2, 3,4,5,6,7,8,9,10};
		int i=0;
		/*Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to test");
		int number = scan.nextInt();
		
		scan.close();*/

		//ternary operator to check number
		if(arr[i]<=10) {
		String result = arr[i]%2==0 ? "Even" : "Odd";
		
		System.out.println(arr[i] +" is "+ result);
		i++;
		
		}
		
	}

}