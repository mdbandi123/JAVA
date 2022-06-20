import java.util.*;
import java.text.*;

public class Pay
{
	public static void main(String[] args) 
	{
		Scanner blank = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");


		System.out.print("Enter your name here: ");
		String name = blank.nextLine();
		System.out.print("Enter skill level here: ");
		int lvl = blank.nextInt();
		System.out.print("Enter hours worked: ");
		int hour = blank.nextInt();
		System.out.print("\n\n");
		double medins1 = 0, dentalins1 = 0, ltdins1 = 0,retplan1 = 0,regpay = 0,compay = 0, hpay = 0, hpay40 = 0;

		switch(lvl)
		{
		case 1:hpay = 17.00; break;
		case 2:hpay = 20.00; break;
		case 3:hpay = 22.00; break;
		default: hpay = 0;
		}

		if ((lvl == 2 || lvl == 3) && hour>40)
			{
			hpay40 = (hour%40) * (hpay * 1.5);
			regpay = (hour-(hour%40)) * hpay;
			compay = regpay + hpay40;
			}
		else 
			{
			regpay = hour * hpay;
			compay = regpay;
			}	
		
		if (lvl == 2 || lvl == 3)
		{
			System.out.println("Would you like to opt for medical insurance?\n[1]Yes\n[2]No");
			int medins = blank.nextInt();
			switch(medins)
			{
				case 1: medins1 = 32.50; break;
				case 2: medins1 = 0; break;
				default: medins1 = 0;
			}
		}	
		
		if (lvl == 2 || lvl == 3)
		{
			System.out.println("Would you like to opt for dental insurance?\n[1]Yes\n[2]No");
			int dentalins = blank.nextInt();
			switch(dentalins)
			{
				case 1: dentalins1 = 20.00; break;
				case 2: dentalins1 = 0; break;
				default: dentalins1 = 0;
			}
		}
		
		if (lvl == 2 || lvl == 3)
		{
			System.out.println("Would you like to opt for long-term disability insurance?\n[1]Yes\n[2]No");
			int ltdins = blank.nextInt();
			switch(ltdins)
			{
				case 1: ltdins1 = 10.00; break;
				case 2: ltdins1 = 0; break;
				default: ltdins1 = 0;
			}
		}
		
		if (lvl == 3)
			{
			System.out.println("Would you like in the retirement plan?\n[1]Yes\n[2]No");
			int retplan = blank.nextInt();
			if (retplan == 1)
				retplan1 = compay * .03;
			}
		

		double deduc = medins1+dentalins1+ltdins1+retplan1;
		double netpay = compay - deduc;



		if (deduc>compay)
		{
			System.out.println("");
			System.out.println("ERROR");
		}

		else
			{
			System.out.println("Name: "+name);
			System.out.println("Hours worked: "+hour);	
			System.out.println("Hourly pay rate : $"+df.format(hpay));
			System.out.println("Regular pay before 40 hours: $"+df.format(regpay));
			System.out.println("Overtime pay : $"+df.format(hpay40));
			System.out.println("Total of regular and overtime pay: $"+df.format(compay));

			System.out.println("");

			System.out.println("*****************DEDUCTIONS*****************");

			System.out.println("Medical Insurance: $"+df.format(medins1));
			System.out.println("Dental Insurance: $"+df.format(dentalins1));
			System.out.println("Long-term Disability Insurance: $"+df.format(ltdins1));
			System.out.println("Retirement Plan: $"+df.format(retplan1));
			System.out.println("Total itemized deduction: $"+df.format(deduc));
			System.out.println("Net pay: $"+df.format(netpay));
			}
		
		
	}
}