
public class Array_Strings {

	public static void main(String[] args) {

		 String[] words = new String[3];
		
		 words[0]="Hello";
		 words[1]="Java";
		 words[2]="Coder";
		 
		 //Output prompt
		 for(int i=0;i<words.length;i++) {
			
			 System.out.println(words[i]);
		
		 }
		 
		 String[] fruits = {"\napple","custurd apple","kiwi","water melon"};
		 
		 //different way of for loop
		 
		 for(String fruit : fruits) {
			 
			System.out.println(fruit);
			 
		 }
		 
	}

}
