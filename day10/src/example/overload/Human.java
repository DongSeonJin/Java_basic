package example.overload;

public class Human {
	
	public int age;
	public String name;
	
	
	public Human(int a, String n) {
		age = a;
		name = n;
	}
		
	public Human() {
		age = 19;
		name = "이름을 입력하지 않았습니다.";
		
	
	}
}
