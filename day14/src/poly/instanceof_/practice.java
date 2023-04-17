package poly.instanceof_;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int i;
		int j;
		int k;
		
		int[] arr = new int[N];
		
		for(int a = 0; a < M; a++) {
			i = scan.nextInt(); 
			j = scan.nextInt(); 
			k = scan.nextInt();
			
			for(int c = i - 1; c < j; c++) {
				arr[c] = k;
			}
			
	}	for(int b = 0; b < arr.length; b++) {	
		System.out.println(arr[b]);
	}

}
}