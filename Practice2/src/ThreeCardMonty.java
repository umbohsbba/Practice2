import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int a = 1 + r.nextInt(3);
		Scanner input = new Scanner(System.in);
		System.out.println("Which one is the ace? \n  ##   ##   ##  \n  ##   ##   ##  \n  1    2    3");

		int d = input.nextInt();

		if (d == a) {
			System.out.println(" You nailed it");
		} else {
			System.out.println("Fast Eddie wins again. The card was number " + a);
		}

	}

}
