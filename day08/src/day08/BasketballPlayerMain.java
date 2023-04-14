package day08;

public class BasketballPlayerMain {
	
	public static void main(String[] args) {
		//농구선수를 둘 만들어주세요
		//하나는 덩크슛에 성공하게, 하나는 실패하게
		BasketballPlayer b1 = new BasketballPlayer("스테판커리", 210, 30, 1000000);
		BasketballPlayer b2 = new BasketballPlayer("이수근", 160, 40, 500000);
		
		
		b1.showInfo();
		b1.dunkShoot();
		b2.showInfo();
		b2.dunkShoot();
	}
}
