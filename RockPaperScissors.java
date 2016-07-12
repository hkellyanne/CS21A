import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		
		final Random randomGenerator;
		String[] game = {"rock", "paper", "scissors"};
		boolean run = true;
		
		
		Scanner console = new Scanner(System.in);
		
		while (run){
			int index = new Random().nextInt(game.length);
			String random = (game[index]);
			
			System.out.println("Enter you choice: "
					+ "\nR or r for Rock "
					+ "\nP or p for paper "
					+ "\nS or s for scissors "
					+ "\nQ or q to quit");
			String choice = console.next().toLowerCase();
			char c = choice.charAt(0);
				if (c == 'q'){
					System.exit(0);
				}
				
				
				else{
				System.out.println("Computer picked: " + random);				

				}
				
				if ((c == 'r' && random == "rock") 
						|| (c == 'p' && random == "paper") 
						|| (c == 's' && random == "scissors")){
					
					System.out.println("You tie with the computer");
					System.out.println();
				}
				
		
				else if ((c == 'r' && random == "paper") 
						|| (c == 'p' && random == "scissors") 
						|| (c == 's' && random == "rock")){
					
					System.out.println("You lose to the computer");
					System.out.println();
				}
			
				else if ((c == 'p' && random == "rock") 
						|| (c == 's' && random == "paper") 
						|| (c == 'r' && random == "scissors")){
					
					System.out.println("You win against the computer");	
					System.out.println();
				
				}
				
				
				

		}
	
	
	
	}
	

}
