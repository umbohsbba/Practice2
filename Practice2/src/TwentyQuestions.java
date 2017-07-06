import java.util.Scanner;

public class TwentyQuestions {

	public static void main(String[] args) {

		String animal = "animal";
		String vegetable = "vegetable";
		String mineral = "mineral";
		String yes = "yes";
		String no = "no";

		Scanner input = new Scanner(System.in);
		System.out.println("TWO QUESTIONS");
		System.out.println("Think of an object, and I'll try to guess it");
		System.out.println("Question 1) Is it an animal, vegetable or mineral?");
		String answer1 = input.next();

		System.out.println("Question 2) Is it bigger than a breadbox?");
		String answer2 = input.next();

		if (answer1.equals(animal) && (answer2.equals(yes))) 
			System.out.println("My guess is that you are thinking of a moose.");
		
		else if (answer1.equals(mineral)&& (answer2.equals(yes))){
			System.out.println("Camaro");
		}
		else if (answer1.equals(vegetable) && (answer2.equals(yes))){
			System.out.println("Watermelon");
		}
		else if (answer1.equals(animal) && (answer2.equals(no))) {
			System.out.println("Squirrel");
	    }
		else if (answer1.equals(mineral) && answer2.equals(no)){
			System.out.println("paper clip");
		}
		else if (answer1.equals(vegetable) && answer2.equals(no)) {
			System.out.println("carrot");
		}
			System.out.println("I would ask you if I'm right but I really don't care.");
		}
	}
	

