import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		Boolean judge = false;
		String comResult = null;
		Random Com = new Random();
		int comResult1 = Com.nextInt(5) + 1;
		String YN = null;
		
		do
		{	switch(comResult1)
			{
			case 1 : comResult = "Rock"; break;
			case 2 : comResult = "Paper";break;
			case 3 : comResult = "Scissors"; break;
			case 4 : comResult = "Lizard"; break;
			case 5 : comResult = "Spock"; break;
			}
			
			System.out.println("Please enter a number to play the game: 1 for Rock, 2 for Paper, 3 for Scissors, 4 for Lizard, 5 for Spock.");
			Scanner keyb = new Scanner (System.in);
			Scanner keyb1 = new Scanner (System.in);
			int num = keyb.nextInt();
			String input = null;
			switch (num)
			{
			case 1 : input = "Rock"; break;
			case 2 : input = "Paper";break;
			case 3 : input = "Scissors"; break;
			case 4 : input = "Lizard"; break;
			case 5 : input = "Spock"; break;
			default: System.out.println("Please enter a number from 1 to 5."); break;
			}
			
			if (num == comResult1)
				System.out.println("Drew!!");
			else if ((comResult1==1||comResult1==5)&&num==3)
				System.out.println("You lose");
			else if ((comResult1==2||comResult1==5)&&num==1)
				System.out.println("You lose");
			else if ((comResult1==3||comResult1==4)&&num==2)
				System.out.println("You lose");
			else if ((comResult1==3||comResult1==1)&&num==4)
				System.out.println("You lose");
			else if ((comResult1==2||comResult1==4)&&num==5)
				System.out.println("You lose");
			else if (num!=1&&num!=2&&num!=3&&num!=4&&num!=5)
				System.out.println("Try it again");
			else
				System.out.println("You win");
			
			System.out.println("The result of computer is " + comResult);
			
			System.out.println("Do you want to play it again? Press Y(for yes), N(for no)");
			YN = keyb1.next();
			if (YN.equals("N"))
				judge = true;
			
		}while(!judge);
	}

}
