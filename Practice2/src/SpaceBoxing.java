import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Earth weight.");
		double earthWeight = input.nextDouble();
		System.out.println("Your Earth weight is:" + earthWeight);

		System.out.println("I have information on the following planets:");
		System.out.println("1. Venus     2.Mars     3. Jupiter");
		System.out.println("4. Saturn    5. Uranus  6. Neptune");

		System.out.println("What planet are you visiting?");
		double planet = input.nextDouble();

		if (planet == 1)
			System.out.println(earthWeight * .78);
		else if (planet == 2)
			System.out.println(earthWeight * .39);
		else if (planet == 3)
			System.out.println(earthWeight * 2.65);
		else if (planet == 4)
			System.out.println(earthWeight * 1.17);
		else if (planet == 5)
			System.out.println(earthWeight * 1.05);
		else if (planet == 6)
			System.out.println(earthWeight * 1.23);
	}

}
