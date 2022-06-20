import java.util.*;//number 6 letter b

public class InchesToFeetInteractive
{
	public static void main(String[] args) 
	{
		Scanner blank = new Scanner(System.in);
		final int FTCON = 12;
		System.out.print("Enter a value: ");
		int inch = blank.nextInt();
		int ans = inch / FTCON;
		int ans2 = inch % FTCON;
		System.out.println(inch+" in foot is "+ans+" feet and "+ans2+" inches");
	}
}