package edu.kh.test.testProject;	
//package(관련된 코드들의 묶음) 명명 규칙
//1. 최소 3레벨 이상
//2. 프로젝트 주소의 기반(거꾸로)

/*
 * 
 */

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World~!"); //영문
		System.out.println("아침은 드셨나요?"); //한글
		System.out.println("123456"); //숫자
		
		//" "(쌍따옴표) : 문자열을 나타냄
		// ==> 안에 작성된 텍스트 (코드)는 단순 문자열로 인식
		System.out.println("1 + 2"); //1 + 2 
		System.out.println(1 + 2);
		//" " 안에 작성도지 않은 코드는 숫자, 변수로 인식
		
		//" "(문자열 + 숫자 함꼐 작성
		System.out.println("14 * 19 = " + 266);
		//숫자와 숫자끼리의 덧셈은 실제 덧셈 연산결과
		//문자열과 숫자 혹은 문자열과 문자열의 덧셈은 ==> 이어쓰기
		System.out.println("14 * 19 = " + 14 * 19);
		
		//notice!
		//자바는 사칙연산의 우선순위를 그대로 따른다
		//ex) 우선 계산을 원하면 () 괄호 사용
	}
}
