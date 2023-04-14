package example.super_;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int min = scan.nextInt();
		int time = scan.nextInt();

		int tot = min += time;
		int a = tot / 60;
		int b = tot % 60;
		
		if(a > 0) {
			h += a;
			if(h > 23) {
				h %= 24;
				
				
				
			}
		}
		
			
		
		System.out.println(h + " " + b);
	}

}
