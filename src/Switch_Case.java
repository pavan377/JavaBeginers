import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		int a,b;

		//Creating object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Operation:");
		String text = input.nextLine();

		//switch case performs desired muliplication,addtion,substraction,division
		switch(text) {
		 
			case "add":  	a=input.nextInt();
							b=input.nextInt();
							System.out.println("sum:"+ (a + b));
							break;
			case "sub":	
							a=input.nextInt();
							b=input.nextInt();
							System.out.println("sub:"+(a - b));
							break;
			case "mul": 
							a=input.nextInt();
							b=input.nextInt();
							System.out.println("mul:"+(a * b));
							break;
			case "div":
							a=input.nextInt();
							b=input.nextInt();
							System.out.println("Quotient:"+(a / b));
							System.out.println("Reminder:"+(a%b));
							break;
			default:
							System.out.println("wrong opertation");
							break;
		}
		
	}

}
