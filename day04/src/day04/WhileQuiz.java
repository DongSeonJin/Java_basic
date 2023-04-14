package day04;

import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		// 컴퓨터랑 스무고개 수 맞추기를 해보겠습니다.
		
		// 이 프로그램은 먼저 Math.ramdom()을 이용해서 수를 하나 얻습니다.
		
		int conValue = (int)(Math.random() * 101); // 0~100숫자 하나 선택됨
		
		//스캐너를 생성해주세요
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("0~100 사이의 숫자를 입력해주세요.");
		// 사용자에게 숫자를 입력받게 해 주세요.
		int userValue = scan.nextInt();
		
		while(conValue != userValue) {
			//불일치라면 먼저 업인지, 다운인지 알려주기
			if(conValue > userValue) {
				System.out.println("업입니다");
			}else {
				System.out.println("다운입니다");
			}
			
			//사용자에게 userValue를 다시 입력받기
			System.out.println("다시 입력해주세요.");
			userValue = scan.nextInt();
			
		}

	}

}
