import java.util.Scanner;

public class valueLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		total += a;


		while (a != 0) {

			System.out.println("Enter another number");
			a = input.nextInt();
			 total += a;

			System.out.println(total);
		}

	}
}
