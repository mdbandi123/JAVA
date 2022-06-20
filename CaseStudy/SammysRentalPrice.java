import java.util.*;
import java.text.*;

public class SammysRentalPrice
{
	public static void main(String[] args) {

	DecimalFormat df = new DecimalFormat("#,###.00");


		
	Scanner sumang = new Scanner(System.in);
	System.out.print("Enter number of minute:");
	int min = sumang.nextInt();
	/*System.out.print("Enter number of minutes:");
	double min = sumang.nextDouble();*/
	

	int time1 = min/60;
	int time2 = min%60;
	
	double fin = (time1*40)+time2;

	System.out.println("Hours\t:\t"+time1);
	System.out.println("Minutes\t:\t"+time2);
	System.out.println("Total Price\t:\tPhp"+df.format(fin));


}

}