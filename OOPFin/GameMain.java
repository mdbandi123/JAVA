import java.util.*;

public class GameMain
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Input
		int numGames, numPlayers, playerScore;
		String gameName,playerName;

		GameInvoked enumObj = new GameInvoked();



		System.out.print("Enter number of games: ");
		numGames = input.nextInt();
		GameInvoked[] gameArr = new GameInvoked[numGames];
		input.nextLine();

		for (int i=0;i<numGames;i++) 
		{ 
			
			int gCount = i+1;
			System.out.print("Enter the Game#"+gCount+": ");
			gameName = input.nextLine();
			gameArr[i] = new GameInvoked(gameName);
		}

		System.out.print("\nEnter number of gamers each games:");
		numPlayers = input.nextInt();

		String[][] playerArr = new String[numGames][numPlayers];
		int[][] scoreArr = new int[numGames][numPlayers];

		for (int i=0; i<numGames;i++)
		{
			int gCount = i+1; 
			System.out.println("\nGame#"+gCount+":"+gameArr[i].getName());
			for (int j=0;j<numPlayers;j++) 
			{
				int pCount = j+1;
				input.nextLine();
				System.out.print("Gamer#"+pCount+": ");
				playerName = input.nextLine();
				playerArr[i][j] = playerName;

				System.out.print("Score: ");
				playerScore = input.nextInt();
				scoreArr[i][j] = playerScore;

			}

		}
		//Output
		m_Printer(enumObj, gameArr, playerArr, scoreArr, numGames, numPlayers);
	}

	public static void m_Printer(GameInvoked enumObj,GameInvoked[] gameArr,String[][] playerArr,int[][] scoreArr, int x, int y)
	{
		System.out.println("\n----------------OUTPUT-------------");
		for (int i = 0;i < x;i++ ) 
		{
			int gCount = i+1;
			System.out.println("\nGame#"+gCount+":"+gameArr[i].getName());
			for (int j = 0;j < y ;j++ ) 
			{
				int pCount = j+1;
				System.out.println(pCount+" - "+playerArr[i][j]);
				System.out.println(" Score: "+scoreArr[i][j]);
				enumObj.setStatus(scoreArr[i][j]);
				System.out.println("Status: "+enumObj.getStatus());

			}
		}
	}
}
