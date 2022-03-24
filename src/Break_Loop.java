
public class Break_Loop {

	public static void main(String[] args) {
		
		int loop=0;
		
		while(true) {
			
			System.out.println("Looping: " + loop);
			
			//Break statement
			if(loop==5) {
				break;
			}
			
			loop++;

			System.out.println("Running");
			
		}
	}

}
