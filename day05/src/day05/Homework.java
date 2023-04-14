package day05;

public class Homework {
	public static void main(String[] args) {
		// 4x + 5y = 60
		for(int x = 0; x <= 15; x++) {
			for(int y = 0; y <= 12; y++) {
				if((4 * x) + (5 * y) == 60)
				System.out.println("x" + "=" + x + "," + "y" + "=" + y);
			}
		}
	}

}
