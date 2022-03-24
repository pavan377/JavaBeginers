import java.util.Scanner;

class Student{
		
	//instance variables
	
		String Name;
		String St_id;
		int Age;
		String Branch;
		String Percentage;
}


public class Student_Class {

	public static void main(String[] args) {
		
		//Creating Student object
		Student student1 = new Student();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		//Wating for user input
		student1.Name = sc.nextLine();
		student1.St_id = sc.nextLine();
		student1.Age = sc.nextInt();
		@SuppressWarnings("resource")
		Scanner bc =new Scanner(System.in);
		student1.Branch = bc.nextLine();
		student1.Percentage = bc.nextLine();
		//output prompt
		System.out.println("Name: "+student1.Name+"\nID: "+student1.St_id+"\nAge: "+student1.Age+"\nBranch:"+student1.Branch+"\nPercentage:"+student1.Percentage);
		
		
	}

}
