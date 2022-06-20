import java.util. *;
class SammySeaShoreSupply{
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of Min: ");
		double min = input.nextDouble();
		double t1 = (int)min/60;
		double t2 = (int)min%60;
		double tp = (int)t1*40+t2;
		System.out.println(" Number of HRS: "+t1);
		System.out.println(" Number of MIN: "+t2);
		System.out.println(" Total Price: "+tp);

		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		System.out.println("Ss Sammy's make it fun in the sun.Ss");
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		

	}
}