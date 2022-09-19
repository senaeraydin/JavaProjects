
public class Main {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2;
		boolean isPrime = true;
		
		System.out.println(remainder);
		
		if(number == 1) {
			System.out.println("The number is not prime");
			return;
		}
		
		if(number<1) {
			System.out.println("The number is invalid.");
		}
		
		for(int i=2; i<number; i++ ) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime == true) {
			System.out.println("The number is prime.");
		}else {
			System.out.println("The number is not prime.");
		}

	}

}
