//주민번호 출력 프로그램
package com.LSM.ch11_1_String;

public class JuminNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jumin = "990725-1234567";
		char gender = jumin.charAt(7); //index는 0부터 시작 주의
		
		switch(gender) { //""는 문자열 ''는 한글자
		case '1': //char타입
		case '3':
			System.out.println("남자");
			break;
		case '2': 
		case '4':
			System.out.println("여자");
			break;
			
		}
		
	}

}
