import java.util.Scanner;

public class Multidimensional_Array {
	
	public static void main(String[] args) {
		//Object creating
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		
		int[][]	a = new int[3][3];
		
		//Loop for input
		System.out.println("Enter the element:");
		
		for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
						a[i][j] = sc.nextInt()	;					 						
				}
		}
		
		System.out.println("The Elements are");
		
		//Loop to access the element
		for(int i=0;i<a.length;i++) {
			    System.out.println("\t");
			for(int j=0;j<a.length;j++) {
					System.out.printf("%d\t",a[i][j]);
	
			}
			System.out.println(" ");
			

		}
	}
}
