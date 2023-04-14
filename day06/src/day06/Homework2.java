package day06;

public class Homework2 {
	public static void main(String[] args) {
		
		String[] food = {"치킨", "피자", "뷔페", "초밥", "마라탕", "죽","짜장면","분식","쌀국수","돈까스"};
		int numb = (int)(Math.random() * food.length);
		
		System.out.println(food[numb]);
	}
}
