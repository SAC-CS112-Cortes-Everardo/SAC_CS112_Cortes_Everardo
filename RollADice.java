import javax.swing.JOptionPane;

public class RollADice {

	public static void main(String args[]) {

		String intro = String.format("Odd or Even Game");
		JOptionPane.showMessageDialog(null, intro);
		
		int wins = 0;
		int badGuesses = 0;
		int gamesPlayed = 0;
		int computerChoice;
		int odd = 0;
		int even = 0;
		String guess;
		String replay;
		
		do {
			computerChoice = 1 + (int) (Math.random()*6);
			String dice;
			 guess =
					JOptionPane.showInputDialog("Did the dice roll Odd or Even?");gamesPlayed++;
			
					dice = computerChoice % 2 == 0? "Even" : "Odd";
				
				if (dice.equals("Even")) {
					even++;
				}
				
				if (dice.equals("Odd")) {
					odd++;
				}	
					
				if (guess.equals(dice)) {
					JOptionPane.showMessageDialog(null, "You Win!");wins++;
				}
				if (!guess.equals(dice)) {
					JOptionPane.showMessageDialog(null, "You guessed wrong");badGuesses++;
				}
			 replay =
					JOptionPane.showInputDialog("Want to play again? Y=Yes N=No");
		}
		while (replay.toUpperCase().equals("Y"));
		
		int percent = (int) 100*wins/gamesPlayed;
		JOptionPane.showMessageDialog(null, "Summary of Results\n" + "# of Good guesses:" + wins + "\n" +
				"# of Bad guesses:" + badGuesses + "\n" + "# of Games Played:" + gamesPlayed + "\n" + 
				"Total Even #:" + even + "\n" + "Total Odd #:" + odd + "\n" + "win percentage:" + 
				percent + "%");
		
	}

}
