package day08;


public class Cat {
	
	public String name;
	public int age;
	public String kind;
	public String color;
	
	public Cat(String na, int ag, String ki, String col) {
		name = na;
		age = ag;
		kind = ki;
		color = col;		
	}

		
	
public void showCatInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(kind);
		System.out.println(color);
	
}

}
