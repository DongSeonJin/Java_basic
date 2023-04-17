package has_a;

public class MainClass {

	public static void main(String[] args) {
		// Gun은 new 키워드로 생성해야 Police 생성지에 전달 가능
		Gun gun = new Gun("k2c1", "369323");
		
		// gun을 사전에 생성하지 않으면 넘길 방법이 없음
		Police police = new Police(gun, "나경찰", 180);
		
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.showStatus();

	}

}
