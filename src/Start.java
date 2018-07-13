import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

//		if (x > 0) {
//			for (int i = 0; i <= x; i++) {
//
//				System.out.print("" + i + (i == x ? "" : ", "));
//
//			}
//		} else {
//			for (int i = x; i <= 0; i++) {
//				System.out.print("" + i + (i == 0 ? "" : ", "));
//			}
//		}
		
		
		
		
		int from = x > 0 ? 0 : x;
		int to = x > 0 ? x : 0;

		if (x > 0) {
			from = 0;
			to = x;
		} else {
			from = x;
			to = 0;

		}
		for (int i = from; i <= to; i++)
			System.out.print("" + i + (i == to ? "" : ", "));

	}

}
