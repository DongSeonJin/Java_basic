
package day05;

import java.util.Scanner;

public class ForStarQuiz3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.close();
		
		for(int i = N; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
			System.out.print("*");
			}
		
			System.out.println();
		
		}	
	}

}
