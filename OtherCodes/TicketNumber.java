import java.util.*;


public class TicketNumber
{
	public static void main(String[] args) 
	{
		Scanner blank = new Scanner(System.in);
		System.out.print("Enter your ticker number\t:\t");
		int tixnum = blank.nextInt();

		int lostnumtix = tixnum/10;
		boolean tixans = (tixnum%10) == (lostnumtix%7);

		System.out.println("The ticket number "+tixnum+" is "+tixans);




	}
}