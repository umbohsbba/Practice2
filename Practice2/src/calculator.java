import java.util.Scanner;

public class calculator  {


public static void main(String[] args) {
	
	
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your weight in pounds.");
	
	double weight = input.nextInt()*703;
	
	System.out.println("Please enter your height in inches.");
	
	double height = input.nextInt();
	double height2 = height*height;
	
	
	double bmi = weight/height2;
	
	System.out.println(bmi);
	
	if(bmi<18.5)
		System.out.println("underweight");
    if(bmi>=18.5 && bmi<=24.9)
    	System.out.println("normal weight");
    if(bmi>=25 && bmi<=29.9)
    	System.out.println("overweight");
    if(bmi>=30)
    	System.out.println("obese");
	
	
	
	
	
	
	
	
}

}