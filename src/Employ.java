
//Creating Class of a employee
class Employee{
		String name;
		int age;
		String eid;
		String email;
	
}


public class Employ {

	public static void main(String[] args) {
		
		//Creating employee1 object
		Employee employee1 = new Employee();
		employee1.name = "PavanKumar B";
		employee1.age = 27;
		employee1.eid = "xxxxx";
		employee1.email = "pavanb9119@gmail.com";
		
		//Creating another employee data
		
		Employee employee2 = new Employee();
		
		employee2.name = "Kumar B";
		employee2.age = 34;
		employee2.eid = "xxxxx";
		employee2.email = "kumarb9119@gmail.com";
		
		System.out.println("Name: "+employee1.name +"\nemail"+employee1.email);
		
		
	}

}
