import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("what is your Last name?");
		String lastName = input.next();

		if (lastName.compareToIgnoreCase("Carswell") <= 0) {
			System.out.println("you don't have to wait long " + lastName);
		} else if (lastName.compareToIgnoreCase("jones") <= 0) {
			System.out.println("That's not bad. " + lastName);
		} else if (lastName.compareToIgnoreCase("Smith") <= 0) {
			System.out.println("looks like a bit of a wait " + lastName);
		} else if (lastName.compareToIgnoreCase("Young") <= 0) {
			System.out.println("It's gonna be a while " + lastName);
		} else {
			System.out.println("You're not going anywhere for a while " + lastName);
		}
	}

}
