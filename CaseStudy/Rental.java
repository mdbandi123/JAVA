import java.util.*;
import java.text.*;

public class Rental
{
	public static void main(String[] args) {
			Scanner sumang = new Scanner(System.in);
			System.out.print("Enter number of minutes: ");
			int mins = sumang.nextInt();
			int hour = 0, xmin = 0,fin = 0, xmin1= 0;

			hour = mins/60;
			xmin = mins%60;

			if (xmin<=40)
				xmin1=xmin;
			else
				xmin1 = 40;
			
			fin = (hour*40)+xmin1;


			System.out.println("Price\t:\tPhp"+fin);




	}
}
