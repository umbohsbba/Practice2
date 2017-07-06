import java.util.Scanner;

public class AgeMessages {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age.");
		int age = input.nextInt();

		if (age < 16) {
			System.out.println("you cannot drive.");
		} else if (age == 16 || age == 17) {
			System.out.println("you can drive but not vote");
		} else if (age >= 18 && age <= 24)
			System.out.println("you can vote but not rent a car");
		else
			System.out.println("you can do whatever you want");

		{

		}
	}
}
