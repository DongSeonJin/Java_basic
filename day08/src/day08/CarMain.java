package day08;

public class CarMain {

	public static void main(String[] args) {
		// 자동차를 한 대 생성해주시고
		// 값은 연료 100, 속도 0, 나머지 요소는 자율적으로 초기화해주세요.
		// 엑셀 3번 밟고, 계기판 조회, 브레이크 2번밟고 계기판 조회하는 코드를
		// 아래에 작성해주세요.
		
		Car a1 = new Car("Tesla", 5, 0, "머스크", 100);
	
		
		// 반복문으로 작성해도 무방함
		a1.accelerate();
		a1.accelerate();
		a1.accelerate();
		
		a1.showStatus();
		
		a1.break_();
		a1.break_();
		
		a1.showStatus();
		

	}

}
