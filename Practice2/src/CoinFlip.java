import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String a = "y";
		do {

			int flip = rng.nextInt(3);
			String coin;

			if (flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("You flip a coin and it is... " + coin);

			System.out.print("Would you like to flip again (y/n)? ");
			a = keyboard.next();

		} while (a.equals("y"));
	}

}
