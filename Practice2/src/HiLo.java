import java.util.Random;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random c = new Random();

		int a = 1 + c.nextInt(100);
		Scanner input = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");
		int d = input.nextInt();
		int n = 0;

		while (d != a && n <= 7)
			if (d == a) {
				System.out.println(" You guessed it.");
			} else if (d < a) {
				System.out.println("Sorry, you are too low. Guess again");
				n++;
				d = input.nextInt();
			} else {
				System.out.println(" You are too high. Try again");
				n++;
				d = input.nextInt();
			}
		System.out.println("you didn't guess right in 5 tries. You lose.");

	}

}
