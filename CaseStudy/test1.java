import java.util.*;

public class test1
{
	public static void main(String[] args) 
	{
		Scanner blank = new Scanner(System.in);
		System.out.println("CALCULATOR TESTER 1");
		
		System.out.print("Enter the first number\t:\t");
		double num1 = blank.nextDouble();
		System.out.print("Enter the second number\t:\t");
		double num2 = blank.nextDouble();

		System.out.println("Enter Operation\n[1] Addition\n[2]Subtraction\n[3]Multiplication\n[4]Division\n[5]Modulo");
		int choice = blank.nextInt();
		double ans = 0;

		switch(choice)
		{
			case 1: ans = num1+num2; break;
			case 2: ans = num1-num2; break;
			case 3: ans = num1*num2; break;
			case 4: ans = num1/num2; break;
			default: System.out.println("Syntax Error");
		}


		System.out.println(ans);


	}
}