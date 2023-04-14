import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		
		
		
		for(int i = 1; i <= N ; i++) {
			for(int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 0;k <= (2 * N) - (i * 2) ; k++) {
				
				System.out.print("*");
				
			}System.out.println();
			
		
		
		
	}
	}
}