import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		int a = 1 + r.nextInt(6);
		int b = 1 + r.nextInt(6);
		do {

			System.out.println("Roll #1: " + a);
			System.out.println("Roll #2: " + b);
			System.out.println("the total is " + (a + b));
			a = 1 + r.nextInt(6);
			b = 1 + r.nextInt(6);
			System.out.println("Roll #1: " + a);
			System.out.println("Roll #2: " + b);
			System.out.println("the total is " + (a + b));

		} while (a != b);
	}
}
