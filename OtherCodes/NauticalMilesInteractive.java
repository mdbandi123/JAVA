import java.util.*;//number 5 letter b

public class NauticalMilesInteractive
{
	public static void main(String[] args)
	{
		Scanner blank = new Scanner(System.in);
		final double KIL = 1.852;
		final double MILES = 1.150779;
		System.out.print("Enter a value: ");
		double naut = blank.nextDouble();
		double ans = KIL * naut;
		double ans2 = MILES * naut;
		System.out.println("The value of "+naut+" nautical miles in kilometers is "+ans+" and "+ans2+" in miles.");
		
	}
}