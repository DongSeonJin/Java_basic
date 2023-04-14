package example.overload;

public class MainClass {

	public static void main(String[] args) {
		OverloadExample ae = new OverloadExample();
		
		ae.input(1);
		ae.input(1, 2);
		ae.input(3.5, "가나다");
		ae.input("하이");
		ae.input("바이", 99.99);

	}

}
