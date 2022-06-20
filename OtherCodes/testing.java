import java.util.*;

public class testing
{
	public static void main(String[] args) 
	{
		Scanner blank = new Scanner(System.in);
		System.out.print("Enter the minutes you will use for calls: ");
		int call = blank.nextInt();
		System.out.print("Enter the minutes you will use for calls: ");
		int text = blank.nextInt();
		System.out.print("Enter how much data you will use(in MBs): ");
		int data = blank.nextInt();



		if (call<500&&text==0&&data==0)
			System.out.println("Get plan A for $49 per month!");

		else if (call<500&&text>0&&data==0)
			System.out.println("Get plan B for $55 per month!");

		else if (call>=500&&text<=100&&data==0)
			System.out.println("Get plan C for $61 per month!");

		else if (call>=500&&text>100&&data==0)
			System.out.println("Get plan D for $70 per month!");

		else if (call>0&&text>0&&data<2000)
			System.out.println("Get plan E for $79 per month!");

		else if (call>0&&text>0&&data<4000)
			System.out.println("Get plan F for $87 per month!");


	}
}