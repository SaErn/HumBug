
public class HundredCount {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			
			if(i >0 && i%3 == 0 && i%5 == 0) {
				System.out.println("HumBug");
			}
			else if(i >0 && i%3 == 0) {
				System.out.println("Hum");
			}else if(i >0 && i%5 == 0) {
				System.out.println("Bug");
			}else {
				System.out.println(i);
			}
			
			
		}

	}

}
