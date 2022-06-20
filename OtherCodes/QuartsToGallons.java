public class QuartsToGallons//number 4 letter A to
{
	public static void main(String[] args) 
	{
	final int QTG = 4;
	int qrtz = 18;
	int ans = qrtz / QTG; 
	int rem = qrtz % QTG; 
	System.out.println("A job that needs "+qrtz+" quartz requires "+ans+" plus "+rem+" quartz");
	}
}