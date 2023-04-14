package example.this_car;

public class Car {
	
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;
		this.speed = 0;
	}
	
	public void accel() {
		if(this.speed + 10 >= 150) {
			this.speed = 150;
		}else {
			this.speed += 10; 
		}
	}
	
	public void showStatus() {
		System.out.println("모델명 :" + this.model);
		System.out.println("현재속도 :" + this.speed);
	}
	
	
}
