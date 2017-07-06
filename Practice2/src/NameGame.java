import java.util.Scanner;

public class NameGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your gender?(M or F)");
		String gender = input.next();

		System.out.println("Enter first name");
		String firstName = input.next();

		System.out.println("Enter last name");
		String lastName = input.next();

		System.out.println("Enter age");
		int age = input.nextInt();

		if (gender.equalsIgnoreCase("F") && age < 20) {
			System.out.println("Then I shall call you " + firstName +" " +lastName);

		} else if (gender.equalsIgnoreCase("F") && age >= 20) {
			System.out.println("Are you married, " + firstName + "?");
			String married = input.next();

			if (married.equalsIgnoreCase("Y"))
				System.out.println("Then I shall call you Mrs. " + lastName);

			if (married.equalsIgnoreCase("N") && age >= 20)
				System.out.println(" Then I shall call you Ms. " + lastName);
			
		} else if (gender.equalsIgnoreCase("M") && age < 20) {
			System.out.println("Then I shall call you " + firstName + lastName);
		} else {
			System.out.println("Then I shall call you Mr. " + lastName);

		}
	}

}
