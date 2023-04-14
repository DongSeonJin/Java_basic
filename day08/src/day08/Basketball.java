package day08;

public class Basketball {
	public static class BasketballPlayer {
		public String name; //농구선수의 이름
		public int height; // 키
		public int age; //나이
		public int salary; //연봉
		
	
		
		// showInfo를 만들어주세요. 위 4가지 요소를 콘솔에 찍어줍니다.
		
	public void showInfo() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(salary);
	}

	public void dunkShoot( ) { // 덩크슛하기 기능
		if(height > 190) {
			System.out.println("덩크슛 성공!");
		}else {
			System.out.println("골대에 알닿음.");
		}
	}
	}
	public static void main(String[] args) {
		//농구선수를 둘 만들어주세요
		//하나는 덩크슛에 성공하게, 하나는 실패하게
		BasketballPlayer b1 = new BasketballPlayer();
		BasketballPlayer b2 = new BasketballPlayer();
		
		b1.name = "스테판커리";
		b1.height = 210;
		b1.age = 30;
		b1.salary = 1000000;
		
		b1.dunkShoot();
		
		b2.name = "이수근";
		b2.height = 160;
		b2.age = 40;
		b2.salary = 500000;
		
		b2.dunkShoot();
	}
	

}
