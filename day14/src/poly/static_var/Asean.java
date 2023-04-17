package poly.static_var;

public class Asean {
	
	private String name;
	private int attendanceScore; // 출결
	private int finalTermScore; // 기말
	
	// 종훈, 일윤, 은영, 재인
	public static int presentationScore; //29
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
		
	}
	// 스태틱 블록 내부 코드는 프로그램 시작 즉시 자동으로 한 번 호출됩니다.
	static {
		presentationScore = 29;
	}
	
	public void showStudentScore() {
		System.out.println("학생명 : " + this.name);
		System.out.println("출석점수 : " + this.attendanceScore);
		System.out.println("팀점수 :" + presentationScore);
		System.out.println("기말점수 :" + this.finalTermScore);
		System.out.println("최종성적 : " + (attendanceScore
									  + presentationScore
									  + finalTermScore));
		System.out.println("---------------------------");
	}
}
