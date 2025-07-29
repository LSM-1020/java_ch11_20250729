package com.LSM.ch11_1_String;

import java.util.Scanner;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("좋아하는 위인을 입력하세요");
		String str = scanner.nextLine();
		
		System.out.println(str.strip()); 
		//문자열 양쪽의 공백을 제거해줌 trim(특수문자공백 안지워짐),strip(특수문자공백 지워짐) strip > trim
		str = str.strip();
		System.out.println(str.length());
		
		
		
	}

}
