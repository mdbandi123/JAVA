public class InchesToFeet//number 6 letter a
{
	public static void main(String[] args) 
	{
		final int FOOTCV = 12;
		int inch = 86;
		int ans = inch / FOOTCV;
		int ans2 = inch % FOOTCV;
		System.out.println(inch+" in foot is "+ans+" feet and "+ans2+" inches");
	}
}