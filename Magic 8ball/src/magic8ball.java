import java.util.Scanner;
public class magic8ball
	{

		public static void main(String[] args)
			{
				Scanner userStringInput = new Scanner (System.in);
				
				int randomNumber = (int)(Math.random()*20+1);
				System.out.println("Welcome, here we may help you with life's quarrels. Ask me a yes or no question, and I shall deliver advice.");
				String quarrel = userStringInput.nextLine();
				
				if (randomNumber ==1)
					{
						System.out.println("Ask again later");
					}
				else if (randomNumber ==2)
					{
						System.out.println("Definitely");
					}
				else if (randomNumber ==3)
					{
						System.out.println("Most likely");
					}
				else if (randomNumber ==4)
					{
						System.out.println("Reply hazy, try again");
					}
				else if (randomNumber ==5)
					{
						System.out.println("YES");
					}
				else if (randomNumber ==6)
					{
						System.out.println("It is decidedly so");
					}
				else if (randomNumber ==7)
					{
						System.out.println("Better Not Tell You");
					}
				else if (randomNumber ==8)
					{
						System.out.println("Don't count on it");
					}
				else if (randomNumber ==9)
					{
						System.out.println("My reply is no");
					}
				else if (randomNumber ==10)
					{
						System.out.println("Signs point to yes");
					}
				else if (randomNumber ==11)
					{
						System.out.println("You may rely on it");
					}
				
				else if (randomNumber ==12)
					{
						System.out.println("Very doubtfull");
					}
				else if (randomNumber ==13)
					{
						System.out.println("Concentrate and ask again");
					}
				else if (randomNumber ==14)
					{
						System.out.println("It is Certain");
					}
				else if (randomNumber ==15)
					{
						System.out.println("The outlook is good");
					}
				else if (randomNumber ==16)
					{
						System.out.println("Without a doubt");
					}
				else if (randomNumber ==17)
					{
						System.out.println("Cannot predict now");
					}
				else if (randomNumber ==18)
					{
						System.out.println("I'm pretty 50/50 on this one.");
					}
				else if (randomNumber ==19)
					{
						System.out.println("You could honestly go either way.");
					}
				else if (randomNumber ==20)
					{
						System.out.println("Depends on how you play it.");
						
					}
								
				
				
				
				
				
				
				
				
				
				

			}

	}
