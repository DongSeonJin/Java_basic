package example.super_;

public class AirplaneMain {

	public static void main(String[] args) {
		SuperSonicAirplane sa1 = new SuperSonicAirplane("OZ109");
		
		for(int i = 0; i < 8; i++) {
			sa1.fly();
		}
		sa1.showStatus();
		System.out.println("--------------");
		for(int i = 0; i < 3; i++) {
			sa1.fly();
		}
		sa1.showStatus();

	}

}
