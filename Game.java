import java.util.Scanner;
import java.util.Random;

public class Game {

	
	public static void main( String[] args )
	
	{
		Scanner input = new Scanner(System.in);
		int playerChoice;
		int computerChoice;
		String computerAnswer = "";
		String playerAnswer = "";
		
		Random generator = new Random();
		
		System.out.printf("Rock, Paper, Scissor\n");
		System.out.printf("Enter 1 for rock, 2 for paper, or 3 for scissor:");
		playerChoice = input.nextInt();
		
		if (playerChoice == 1) 
			playerAnswer = "rock"; 
		    else if (playerChoice == 2) 
		    	playerAnswer = "paper"; 
		    else if (playerChoice == 3) 
		    	playerAnswer = "scissor";
		
	    System.out.println("Player play is: " + playerAnswer); 

		computerChoice = generator.nextInt(3)+1;
		
		if (computerChoice == 1) 
			computerAnswer = "rock"; 
		    else if (computerChoice == 2) 
		    	computerAnswer = "paper"; 
		    else if (computerChoice == 3) 
		    	computerAnswer = "scissor";
		
	    System.out.println("Computer play is: " + computerAnswer);
	    
	    if (playerAnswer != "rock" && playerAnswer != "paper" && playerAnswer != "scissor")
	    	System.out.println("Invalid user input.");
	    
	    else if (playerAnswer == computerAnswer) {
	        System.out.println("It's a tie!"); 
	    }
	     else if (playerAnswer == "rock") {
	        if (computerAnswer == "scissor") 
	           System.out.println("Rock crushes scissors. You win!");
	     else if (computerAnswer == "paper") 
	             System.out.println("Paper eats rock. You lose!");
	     }
	     else if (playerAnswer == "paper") { 
	        if (computerAnswer == "scissor") 
	        System.out.println("Scissor cuts paper. You lose!"); 
	     else if (computerAnswer == "rock") 
	             System.out.println("Paper eats rock. You win!");
	     }
	     else if (playerAnswer == "scissor") {
	          if (computerAnswer == "paper") 
	          System.out.println("Scissor cuts paper. You win!"); 
	     else if (computerAnswer == "rock") 
	             System.out.println("Rock breaks scissors. You lose!");
	     }

	}
	
}