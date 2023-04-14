package day04;

import java.util.Scanner;

public class WhileQuizHomeWork {

	public static void main(String[] args) {
		// 컴퓨터랑 스무고개 수 맞추기를 해보겠습니다.
		
		// 이 프로그램은 먼저 Math.ramdom()을 이용해서 수를 하나 얻습니다.
		
		
		//스캐너를 생성해주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("최대 범위를 지정해주세요.");
		
		int range = scan.nextInt() + 1;
		
		int conValue = (int)(Math.random() * range); 
		System.out.println("0~" + (range - 1) + "사이의 숫자를 입력해주세요");
		
		// 사용자에게 숫자를 입력받게 해 주세요.
		int userValue = scan.nextInt();
		// 시도 횟수 카운트
		int count = 0;
		
		while(conValue != userValue)  {
			// 범위값을 넘을시 값을 다시받기
			while(range <= userValue) {
			System.out.println("지정한 범위안의 숫자를 입력해주세요.");
			userValue = scan.nextInt();
			}
			// 값이 범위를 안넘을 시 업인지, 다운인지 알려주기
			if(conValue > userValue) { 
				System.out.println("업입니다");
			}else {
				System.out.println("다운입니다");
			}
			//사용자에게 userValue를 다시 입력받기
			System.out.println("다시 입력해주세요.");
			userValue = scan.nextInt();
			count++; // if문 안에서만 카운트
			} 
			count++; // 정답일경우에도 카운트 +1
			System.out.println("정답! 시도횟수:"+count);
			scan.close();
	}
}
