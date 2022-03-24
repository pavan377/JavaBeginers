import java.util.Scanner;

//Creating class of cat
class Cat{
	
	//Creating instance Variable
	String Name;
	String Breed;
	String Colour;
	int max_living_life;
	
}
public class Cat_Class {

	public static void main(String[] args) {
		
		//Creating Object of a class
		Cat cat1 = new Cat();
		//creating Scannner object to read the input from user
		Scanner sc = new Scanner(System.in);
		//
		cat1.Name = sc.nextLine();
		cat1.Breed = sc.nextLine();
		cat1.Colour = sc.nextLine();
		cat1.max_living_life = sc.nextInt();
		
		//Printing the Cat class instances

		System.out.println("Name:"+cat1.Name+"\nBreed :"+cat1.Breed+"\nColour:"+cat1.Colour+"\nLiving_life: "+cat1.max_living_life);
		
		
	}

}
