package example.overload;

public class Cat {
	
	public String kind;
	public String name;
	
	public Cat() {
		kind = "정보를입력해주세요";
		name = "아무개";
	}
	
	public Cat(String k, String n) {
		kind = k;
		name = n;
		System.out.println("지금부터 이 아이의 이름은" + n + "입니다");
	}
	
	public void call() {
		System.out.println("야옹아 이리와");
	}
	
	public void call(String name) {
		System.out.println(name + "아 이리와");
	}
}
