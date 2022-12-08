package programs;

public class GetPrimeNumberForOnlyOneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		int i = 2;
		while (true) {
			if (n % i == 0) {
				break;
			} else {
				i++;
			}
		}
		if (i == n) {
			System.out.println(i + " :It is a prime number");
		} else {
			System.out.println(i + " : is not a prime number");
		}

	}

}
