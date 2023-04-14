package poly.noinheri;

public class MainClass4 {

	public static void main(String[] args) {
		// rat도 2마리 만들어서 한 마리를 사냥하는 상황도 만들어주세요.
		
		Pig c1 = new Pig();
		Pig c2 = new Pig();
		
		Warrior w1 = new Warrior("자바전사");
		
		w1.showStatus();
		w1.huntPig(c2);
		
		w1.showStatus();
		w1.huntPig(c2);
		
		w1.showStatus();
		w1.huntPig(c2);
		
		w1.showStatus();
		
		Ghost g1 = new Ghost();
		Ghost g2 = new Ghost();
		
		w1.huntGhost(g2);
		w1.showStatus();
		
		w1.huntGhost(g2);
		w1.showStatus();
		
		w1.huntGhost(g2);
		w1.showStatus();
		
}
}
