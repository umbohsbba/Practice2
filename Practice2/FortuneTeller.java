import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
String exit;
String close;
do{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstName = scanner.next();

		System.out.println("What is your last name?");
		String lastName = scanner.next();
		String combined = firstName.concat(lastName);

		System.out.println("What is your age?");
		int age1 = scanner.nextInt();
		String old;
		if (age1 % 2 == 0); 
		 old ="25";
		{
		}
	    if (age1 % 2 == 1); 
		 old = "35";
		{
		}
		
			System.out.println("What is your birthmonth?");
			String money = null;
			String birthMonth = scanner.next();
			if(combined.contains(birthMonth.substring(0,1))){
				money = "one million";
			}
			if(combined.contains(birthMonth.substring(1,2))){
				money = "fifty";
			}
			if(combined.contains(birthMonth.substring(2,3))){
				money = "one hundred";
			}
			
//			String substring1stletter = birthMonth.substring(0, 1);
//			String substring2ndletter = birthMonth.substring(1, 2);
//			String substring3rdletter = birthMonth.substring(2, 3).toLowerCase();
//			String money = null;
//			if (combined.contains(substring1stletter))
//				money = "one million";
//			{
//			}
//			if (combined.contains(substring2ndletter))
//				money = "fifty";
//			{
//			}
//			if (combined.contains(substring3rdletter))
//				money = "one hundred";
//			{
//
//			}
			System.out.println("What is your favorite ROYGBIV color?(If you don't know what ROYGBIV is enter \"help\"");
			String roygbiv = scanner.next();

			if (roygbiv.equalsIgnoreCase("help")) {
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet. Please enter favorite color");
				roygbiv = scanner.next();
			}

			String car = null;

			String firstRoygbivLetter = roygbiv.toLowerCase().substring(0, 1);
			switch (firstRoygbivLetter) {
			case "r":
				car = "Blue Camaro";
				break;
			case "o":
				car = "Tesla";
				break;
			case "y":
				car = "Bicycle";
				break;
			case "g":
				car = "airplane";
				break;
			case "b":
				car = "helicopter";
				break;
			case "i":
				car = "RV";
				break;
			case "v":
				car = "Lamborghini";
				break;
			}

			System.out.println("How many of siblings do you have?");
			int siblings = scanner.nextInt();
			String location = null;
			if (siblings == 0) {
				location = "Cleveland";
			}
			if (siblings == 1) {
				location = "Hawaii";
			}
			if (siblings == 2) {
				location = "Bali";
			}
			if (siblings == 3) {
				location = "Florida";
			} else if (siblings >= 3) {
				location = "Antarctica";
			}

			System.out.println(firstName + " " + lastName + " will retire in" + " " + old + " " + "years, with" + " " + money
					+ " dollars in the bank, a vacation home in" + " " + location + ", driving a" + " " + car + ".");
			
			System.out.println("Would you like to try again? y or n");
			exit = scanner.next();
         
	}       while(exit.equals("y"));
            System.out.println("Goodbye");
            
            	
			
		}
	}




// "firstName, lastName will retire in years2 with money in the bank, avacation
// home in and a car");

// amount of money determined by letters in common

// separate letters of birthmonth = $
// String substring1stletter = birthMonth.substring(0,1);
// Favorite color = Location

// # of siblings

// display fortune

// start again??
