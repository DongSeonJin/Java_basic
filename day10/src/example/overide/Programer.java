package example.overide;

public class Programer extends Human{
	
	public String skill;
	public int experience;
	
	public void 코딩하기() {
		System.out.println(skill + "언어를 이용해 코딩 가능합니다.");
	}
	
	public void 자기소개하기() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println(skill + " " + experience + "년차 입니다.");
	}
	
	
}
