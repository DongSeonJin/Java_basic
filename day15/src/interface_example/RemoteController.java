package interface_example;

public interface RemoteController {
	
	int MAX_BATTERY = 100;
	int MIN_BATTERY = 0;
	
	// 리모컨이 가져야하는 필수 기능에 대해서만 정의
	public void turnOn();
	
	public void turnOff();
	
	public void showStatus();

}
