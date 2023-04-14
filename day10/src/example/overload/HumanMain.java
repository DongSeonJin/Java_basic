package example.overload;

public class HumanMain {

	public static void main(String[] args) {
		// Human을 생성하시되
		// 하나는 void생성자를 이용해주시고
		
		// 다른 하나는 (String, int) 생성자를 이용해주세요.
		
		Human a1 = new Human();
		Human a2 = new Human(27, "아무개");
		
		System.out.println(a1.name);
		System.out.println(a1.age);
		
		System.out.println(a2.name);
		System.out.println(a2.age);

	}

}
