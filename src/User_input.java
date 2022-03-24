import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		
		try (//create scanner object
		Scanner input = new Scanner(System.in)) {
			//Output prompt
			System.out.println("Enter a line of text: ");
			
			//wait for user input
			String line = input.nextLine();
			
			//Output promt
			System.out.println(line);
			
			System.out.println("\nEnter double value: ");
			
			//wait for user input to enter value
			double value = input.nextDouble();
			
			//Output prompt
			System.out.println("Value: "+ value);
		}
		
	
	}

}
