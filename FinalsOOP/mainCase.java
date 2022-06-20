import java.util.*;

public class mainCase
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Initalization------------------------------------------------------------
		int len,elem,odd=0,even=0;
		System.out.print("Enter the number of integers to input: ");
		len = input.nextInt();
		
		capsuleCase[] mixedArr = new capsuleCase[len];

		for (int i = 0;i<len;i++) 
		{
			System.out.print("Enter element: ");
			elem = input.nextInt();
			mixedArr[i] = new capsuleCase(elem);
			if(elem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}

		capsuleCase[] evenArr = new capsuleCase[even];
		capsuleCase[] oddArr = new capsuleCase[odd];
		splitter(evenArr, oddArr, mixedArr);
		capsuleCase[][] multiArr = {evenArr,oddArr};

		//Process----------------------------------------------------------------------
		sort(evenArr,oddArr,multiArr);
		total(evenArr,oddArr,multiArr);

		//Output-----------------------------------------------------------------------
		printer(evenArr,oddArr,multiArr);
	}

	public static void splitter(capsuleCase[] evenArr, capsuleCase[] oddArr, capsuleCase[] mixedArr)
	{	
		int n1 = 0, n2 = 0;
		for (int i=0;i<mixedArr.length;i++ ) 
		{
			if(mixedArr[i].getElem()%2==0)
			{
				evenArr[n1]=new capsuleCase(mixedArr[i].getElem());
				n1++;
			}
			else
			{
				oddArr[n2]=new capsuleCase(mixedArr[i].getElem());
				n2++;
			}	
		}
	}

	public static void sort(capsuleCase[] evenArr, capsuleCase[] oddArr, capsuleCase[][] multiArr)
	{
		int low;
		for (int i = 0;i<evenArr.length;i++) 
		{
			low = i;
			for (int j = i+1;j<evenArr.length;j++) 
			{
				if((multiArr[0][low].getElem()) > (multiArr[0][j].getElem()))
				{
					low = j;
				}
			}

			capsuleCase swapper = multiArr[0][i];
			multiArr[0][i] = multiArr[0][low];
			multiArr[0][low] = swapper;
		}

		for (int i = 0;i<oddArr.length;i++) 
		{
			low = i;
			for (int j = i+1;j<oddArr.length;j++) 
			{
				if((multiArr[1][low].getElem()) > (multiArr[1][j].getElem()))
				{
					low = j;
				}
			}

			capsuleCase swapper = multiArr[1][i];
			multiArr[1][i] = multiArr[1][low];
			multiArr[1][low] = swapper;
		}
	}

	public static void total(capsuleCase[] evenArr, capsuleCase[] oddArr, capsuleCase[][] multiArr)
	{
		int total1 = 0,total2 = 0;
		for (int i = 0;i<evenArr.length;i++) 
		{
			total1 += multiArr[0][i].getElem();
		}

		for (int i = 0;i<oddArr.length;i++) 
		{
			total2 += multiArr[1][i].getElem();
		}

		if(oddArr.length>0 && evenArr.length>0)
		{
			evenArr[0].setTotal(total1);
			oddArr[0].setTotal(total2);
		}
		else if(evenArr.length>0 && oddArr.length<=0)
		{
			evenArr[0].setTotal(total1);
		}
		else if(evenArr.length<=0 && oddArr.length>0)
		{
			oddArr[0].setTotal(total2);
		}

		
	}

	public static void printer(capsuleCase[] evenArr, capsuleCase[] oddArr, capsuleCase[][] multiArr)
	{	
		System.out.println("\nHighest to lowest: ");
		System.out.println("Even: ");
		for (int i = evenArr.length-1;i >= 0;i--) 
		{
			System.out.print(multiArr[0][i].getElem()+" -> ");
		}

		System.out.println("\nOdd: ");
		for (int i = oddArr.length-1;i >= 0;i--) 
		{
			System.out.print(multiArr[1][i].getElem()+" -> ");
		}



		System.out.println("\n\nTOTAL:");
		if(oddArr.length>0 && evenArr.length>0)
		{
			System.out.println("even: "+evenArr[0].getTotal());
			System.out.println("odd: "+oddArr[0].getTotal());
		}
		else if((evenArr.length>0) && (oddArr.length<=0))
		{
			System.out.println("even: "+evenArr[0].getTotal());
			System.out.println("odd: 0 ");
		}
		else if(evenArr.length<=0 && oddArr.length>0)
		{
			System.out.println("even: 0");
			System.out.println("odd: "+oddArr[0].getTotal());
		}
		
	}
}
