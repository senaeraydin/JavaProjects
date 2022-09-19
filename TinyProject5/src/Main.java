
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0}
		int finding = 5;
		boolean areThere = false;
		
		for(int number : numbers) {
			if(numbers == finding) {
				areThere = true;
				break;
			}
		}
		
		if(areThere) {
			System.out.println("There is number");
		}else {
			System.out.println("There is no number");
		}
		
		

	}

}
