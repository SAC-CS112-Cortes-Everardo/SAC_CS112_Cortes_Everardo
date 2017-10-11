
import java.util.Scanner;

public class GuessGame {
    
    public static void main(String[] args)
    {
    	int count = 1;
    	String replay;
    	int wins = 0;
    	int lose = 0;
    	
		do {
			
        Scanner input = new Scanner(System.in);
        
        int playerNumber;
        int computerNumber;	
        
        System.out.printf("Enter a number 1-10: ");
        playerNumber = input.nextInt();
        computerNumber = 1 + (int) (Math.random()*10);
            
        System.out.printf("You chose: %d\n", playerNumber );
        System.out.printf("Computer chose: %d\n", computerNumber);
        
        if (playerNumber > 10 || playerNumber < 1) {
            System.out.printf("Not a valid number!\n");
        }
        
        else if (playerNumber == computerNumber) {
                System.out.printf("You Win!\n"); wins++;
                
            } else if (playerNumber > computerNumber) {
                System.out.printf("Your number is bigger.\n"); lose++;
           
            } else if (playerNumber < computerNumber) {
                System.out.printf("Your number is smaller.\n"); lose++;
            }
        
        System.out.println("Games played: " + count); count++; 
        System.out.println("Wins: " + wins);
        System.out.println("Lose: " + lose);
        float percent = (float) wins/count * 100;
        System.out.println("Overall Percent: " + percent + "%");

        
        System.out.println("Want to play again?");
        System.out.print("Y=Yes, N=No: ");
        replay = input.next();
        
        if (replay.toUpperCase().equals("Y"))
            System.out.print("");
        else
            System.out.print("Good Bye.");
    	}
    	while (replay.toUpperCase().equals("Y")); 
   
    }
}