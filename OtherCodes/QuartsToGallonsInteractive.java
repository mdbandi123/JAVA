import java.util.*;//number 4 letter b

public class QuartsToGallonsInteractive
{
	public static void main(String[] args) 
	{
	Scanner iq = new Scanner(System.in);
	final int QTG = 4;
	System.out.print("Enter the value: ");
	int qrtz = iq.nextInt();
	int ans = qrtz / QTG; 
	int rem = qrtz % QTG; 
	System.out.println("A job that needs "+qrtz+" quartz requires "+ans+" plus "+rem+" quartz");
	}
}