package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		
		Rabbit r1 = new Rabbit();
		Rat r2 = new Rat();
		Warrior w1 = new Warrior("자바전사");
		Magician m1 = new Magician("자바법사");
		
		w1.showStatus();
		w1.hunt(r1);
		w1.hunt(r1);
		w1.hunt(r1);
		w1.hunt(r1);
		
		w1.showStatus();
		
		m1.castFirebll(r2);
		m1.castFirebll(r2);
		m1.castFirebll(r2);
		m1.castFirebll(r2);
		
		m1.showStatus();
		
		
		
		
	}

}
