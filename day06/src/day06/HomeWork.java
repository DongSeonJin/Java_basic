package day06;

public class HomeWork {
	public static int example1(int x) {
		int value = 0;
		for(int i = 1; i <= x; i++) {
			if(i % 2 == 0); {
				value += i;
			}
			
		}	return value;
		
	}
	
	public static void example2(String name) {
		System.out.println("반갑습니다 " + name + "님");
		
	}
	
	public static void example3(String a, int b) {
		System.out.println("주문하신" + a + "가격은");
		System.out.println(b + "원 입니다.");
	} 
	
	public static void main(String[] args) {
		System.out.println(example1(10));
		example2("진동선");
		example3("치킨",20000);
	}

}
