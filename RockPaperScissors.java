import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Boolean judge = false;
		String comResult = null;
		Random Com = new Random();
		int comResult1 = Com.nextInt(3) + 1;
		String YN = null;
		
		do
		{	switch(comResult1)
			{
			case 1 : comResult = "Rock"; break;
			case 2 : comResult = "Paper";break;
			case 3 : comResult = "Scissors"; break;
			}
			
			System.out.println("Please enter a number to play the game: 1 for Rock, 2 for Paper, 3 for Scissors.");
			
			Scanner keyb = new Scanner (System.in);
			int num = keyb.nextInt();
			String input = null;
			switch (num)
			{
			case 1 : input = "Rock"; break;
			case 2 : input = "Paper";break;
			case 3 : input = "Scissors"; break;
			default: System.out.println("Please enter a number from 1 to 3."); break;
			}
			
			if (num == comResult1)
				System.out.println("Drew!!");
			else if (comResult1==1&&num==3)
				System.out.println("You lose!");
			else if (comResult1==2&&num==1)
				System.out.println("You lose!");
			else if (comResult1==3&&num==2)
				System.out.println("You lose!");
			else
				System.out.println("You win!");
			
			System.out.println("The result of computer is " + comResult);
			
			System.out.println("Do you want to play it again? Press Y(for yes), N(for no)");
			YN = keyb.next();
			if (YN.equals("N"))
				judge = true;
			
		}while(!judge);
	}

}
