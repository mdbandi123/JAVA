import java.util.*;
import java.text.*;

public class MinuteConversion
{

	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("#,###.000");
		DecimalFormat df2 = new DecimalFormat("#,###");
		Scanner blank = new Scanner(System.in);
		
		int min;
		double hour, days;
		
		System.out.print("Enter the number of minutes here: ");
		
		min = blank.nextInt(); 
		hour = min/60;
		days = hour/24;

		System.out.println(min+" minutes is equals "+df2.format(hour)+" hours and equals "+df.format(days)+" days.");


	}
}