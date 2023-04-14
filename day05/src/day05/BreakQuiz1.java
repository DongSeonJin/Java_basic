package day05;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {
		// 1. 난수 2개를 발생시켜주세요. 단, 난수는 1~10범위로 두 개 만들어주세요.
		
		// 2. while문을 무한루프로 만들어주시고, 위에서 발생된 난수 2개를
		//    a * b 의 답은? 이라고 질문해서 문제를 출제하게 해 주세요.
		
		// 3. if문을 비교해 정답시 break로 루프문을 빠져나오고
		//    오답인경우 "오답입니다" 라는 멘트와 함께 답을 재입력받도록 해주세요.
		Scanner scan = new Scanner(System.in);
		int answer = -1;
		
		int numb1 = (int)(Math.random() * 10) + 1;
		int numb2 = (int)(Math.random() * 10) + 1;
		
		
		while(true) {
			System.out.println(numb1 + "*" + numb2 + "의 답은?");
			answer = scan.nextInt();
			
			if(answer == (numb1 * numb2)) {
				System.out.println("정답입니다");
				break;
			}else {
				System.out.println("오답입니다");
				answer = scan.nextInt();
				
			}
		}

	}

}
