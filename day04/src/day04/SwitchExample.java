package day04;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		/*
		 * 직급을 입력하세요.
		 * [사원,대리,과장,차장,부장] -> 200만원, 300만원, 400만원, 500만원, 600만원
		 * >
		 * 대리의 급여는 300만원입니다./
		 * or
		 * 사워은 없는 직급입니다.
		 * 직급을 다시 입력해주세요.
		 */
		//스캐너를 생성해서 직급을 입력받을수 있게 해주세요
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("직급을 입력하세요");
		System.out.println("[사원,대리,과장,차장,부장]");
		
		String level = scan.next();
		
		switch(level) {
		case "사원":
			System.out.println("사원의 직급은 200만원입니다.");
			break;
		case "대리":
			System.out.println("대리의 월급은 300만원 입니다.");
			break;
		case "과장":
			System.out.println("과장의 월급은 400만원 입니다.");
			break;
		case "차장":
			System.out.println("차장의 월급은 500만원 입니다.");
			break;
		case "부장":
			System.out.println("부장의 월급은 600만원 입니다.");
			break;
			default:
				System.out.println(level + "은(는) 없는직급입니다");
				System.out.println("직급을 다시 입력해주세요.");
		}
		
		
		

	}

}
