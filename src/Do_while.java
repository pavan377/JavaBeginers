import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {

		//Creating Scanner object
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		/*//Output prompt
		System.out.println("Enter number :");
		int value = scanner.nextInt();
		
		//loop 
		while(value != 5) {
		 
			System.out.println("Enter number ");
			//input prompt
			value=scanner.nextInt();
			
		}
		
		 * */
		int value1 = 0;
		//do - while
		do {
			
			System.out.println("Enter number :");
			value1 = scanner.nextInt();
			
		}while(value1 != 5);
		//output prompt
		System.out.println("Got 5!");
		
		}
}