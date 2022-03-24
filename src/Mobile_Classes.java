import java.util.Scanner;

//Creating Class of Mobile phone and its instances

class Mobile{
	String CompanyName;
	String RAM;
	String ROM;
	String Batter_Capacity;
	int Cost;
}

//Main class
public class Mobile_Classes {

	public static void main(String[] args) {
		//creating object of the Mobile_Company Class
		Mobile mb1 = new Mobile();
		
		//Creating user input
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//Reading the Values form user
		mb1.CompanyName = sc.nextLine();
		mb1.RAM	= sc.nextLine();
		mb1.ROM	= sc.nextLine();
		mb1.Batter_Capacity = sc.nextLine();
		mb1.Cost = sc.nextInt();
		//Printing
		System.out.println("ComapnyName: "+ mb1.CompanyName+ "\nRAM: "+ mb1.RAM+"\nROM: "+mb1.ROM+ "\nBattery_Capacity: "+ mb1.Batter_Capacity+"\nCost: "+mb1.Cost);
		
	}

}
