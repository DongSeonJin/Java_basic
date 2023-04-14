package day05;

import java.util.Scanner;

public class ForStarQuiz4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		scan.close();
		
		for(int i = 1;i <= N; i++ ) {
			for(int j = 2; j <= i; j++){
			System.out.print(" ");
			}
			for(int k = N; k >= i; k--){
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
