
public class Arrays {

	public static void main(String[] args) {
		//DECLARING THE ATTRIBUTES
	
		int value = 7;
		
		//Array declaration
		int[] values;
		values = new int[4];
		
		//Normal local variable
		System.out.println("value:"+value);
		
		System.out.println("Array values before assigning");
	
		System.out.println(values[0]);
		
		//assigning values explicitly
		values[0] = 10;
		values[1] = 11;
		values[2] = 13;
		
		//output prompt
		System.out.println("Array values after assigining");
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		//One-dimensional array initialization
		System.out.println("One-dimension array eleemtns");
		
		int[] numbers = {5,6,7};
		
		for(int i=0;i<numbers.length;i++) {
			
				System.out.println(numbers[i]);

		}
		
		
		
	}

}
