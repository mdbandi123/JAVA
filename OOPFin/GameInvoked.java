public class GameInvoked
{
	private int score;
	private String name;

	enum Status 
	{
		DEFAULT, NOOB, SAVAGE, EXPERT, MASTER, VETERAN, LEGENDARY, MYTHICAL;
	}

	GameInvoked()
	{

	}
	
	GameInvoked(String x)
	{
		name = x;
	}

	public String getName()
	{
		return name; 
	}

	public void setStatus(int y)
	{
		score = y;
	}

	//Main Process
	public Status getStatus()
	{
		Status z = Status.DEFAULT;
		if (score>=1 && score<=50) 
		{
			z = Status.NOOB;
		}

		else if (score>=51 && score<=100) 
		{
			z = Status.SAVAGE;
		}

		else if (score>=101 && score<=150) 
		{
			z = Status.EXPERT;
		}

		else if (score>=151 && score<=200) 
		{
			z = Status.MASTER;
		}

		else if (score>=201 && score<=250) 
		{
			z = Status.VETERAN;
		}

		else if (score>=251 && score<=300) 
		{
			z = Status.LEGENDARY;
		}

		else if (score>=301) 
		{
			z = Status.MYTHICAL;
		}

		return z;
	}
}
