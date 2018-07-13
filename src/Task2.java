import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		sc.close();
		
	
		int small = 0;
		int big = 0;
		
		if (x < y) {
			small = x;
			big = y;
		}else if (x > y) {
			big = x;
			small = y;
		}
		
		String result = "";
		for (int i = small; i <= big; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 != 0) {
				result = result + i + ", ";
				
			}
		}
		result = result.substring(0, result.length() - 2);
		System.out.println(result);

	}

}
