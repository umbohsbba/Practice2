import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int b = 1 + r.nextInt(10);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10.");
		int a = input.nextInt();
        int n =0;
		while (a != b)
		{
			System.out.println("Incorrect, try again.");
            System.out.print("enter another number: "); n++;
            a = input.nextInt();
		}
		System.out.println(" You WON in  " + (n + 1) +" tries");
	}
	
}
