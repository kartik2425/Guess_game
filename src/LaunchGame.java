import java.util.*;
class Guesser
{
	int guessnum;
	
	int guessnum()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Guesser Kindly guess a number : ");
		guessnum=sc.nextInt();
		if(guessnum<0)
		{
			System.out.println("kindly enter positive integer number!");
			return guessnum();
		}
		return guessnum;
	}
}
class Player{
	
	int guessnum;
	int guessnum()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("player kindly guess a number : ");
		guessnum=sc.nextInt();
		if(guessnum<0)
		{
			System.out.println("kindly enter positive integer number!");
			return guessnum();
		}
		return guessnum;
		
	}
	
	
}


class Umpire {
	
	int guessnumber;
	int player1;
	int player2;
	int player3;
	
	void guessernum()
	{
		Guesser g = new Guesser();
		guessnumber = g.guessnum();
		
	}
	void playernum()
	{
		Player p = new Player();
		player1=p.guessnum();
		player2=p.guessnum();
		player3=p.guessnum();
	}
	void compare()
	{
		if(guessnumber==player1)
		{
			if(guessnumber==player2 && guessnumber==player3)
			{
				System.out.println("All payers won the game  won the game!");
				
			}
			else if(guessnumber==player2)
			{
				System.out.println("Player1 and Player2  won the game!");
			
			}
			else if(guessnumber==player3)
			{
				System.out.println("Player1 and Player3  won the game!");
			}
			else {
				System.out.println("Player1 won the game!");
			}
			
		
		}
		else if(guessnumber==player2)
		{
			if(guessnumber==player1)
			{
 
				System.out.println("Player1 and Player2  won the game!");
			}
			else if(guessnumber==player3)
			{
				System.out.println("Player2 and Player3  won the game!");
			}
			System.out.println("Player2 won the game!");
		}
		else if(guessnumber==player3)
		{
			if(guessnumber==player1)
			{
 
				System.out.println("Player1 and Player3  won the game!");
			}
			else if(guessnumber==player2)
			{
				System.out.println("Player2 and Player3  won the game!");
			}
			System.out.println("Player3 won the game!");
		}
		else
		{
			System.out.println("players not able guess the number");
		}
	}
}

	
public class LaunchGame 
{
	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.guessernum();
		u.playernum();
		u.compare();
		
	}
}

