//Kelly Hall
public class Stairs {
	public static final int STEPS = 4;
	public static void main(String[] args) {
		for (int i = 1; i <= STEPS; i++){
			for (int j = i; j <= STEPS-1; j++){
				System.out.print("     ");
			}
			for (int k = 1; k <= 1; k++){
				System.out.print("  O  ******");
				for (int j = (i*5)+1; j >= 7; j--){
					System.out.print(" ");
				}				
				for(int h = k; h <= 1; h++){
					System.out.println("*");
				}
				
			}
			
			
			for (int j = i; j <= STEPS-1; j++){
				System.out.print("     ");
			}
			
			
			for (int k = 1; k <= 1; k++){
				System.out.print(" /|\\ *");
				for (int j = (i*5)+1; j >= 2; j--){
					System.out.print(" ");
				}				
				for(int h = k; h <= 1; h++){
					System.out.println("*");
				}
			}
			
			
			

			for (int j = i; j <= STEPS-1; j++){
				System.out.print("     ");
			}
			
			
			
			
			
			for(int k = 1; k <= 1; k++){
				System.out.print(" / \\ *");
				for (int j = (i*5)+1 ; j >= 2; j--){
					System.out.print(" ");
				}
				for(int h = k; h <= 1; h++){
					System.out.print("*");
				}
				
			
				
			}
			


		System.out.println();


		}
		for (int t = 1; t <= 1; t++){
			System.out.print("************");
			for (int y = t; t<= STEPS-1; t++){
				System.out.print("*****");
			}
		}

}
}


