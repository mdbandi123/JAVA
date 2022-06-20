public class NauticalMiles//number 5 letter a
{
	public static void main(String[] args)
	{
		final double KIL = 1.852;
		final double MILES = 1.150779;
		double naut = 21.2;
		double ans = KIL * naut;
		double ans2 = MILES * naut;
		System.out.println("The value of "+naut+" nautical miles in kilometers is "+ans+" and "+ans2+" in miles.");
		
	}
}