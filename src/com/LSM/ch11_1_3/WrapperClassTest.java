package com.LSM.ch11_1_3;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer int1 = new Integer("1000");//->이방법은 추천하지않음
		System.out.println(int1.intValue() + 1000);
		
		Integer.parseInt("1000");//-> 요즘은 문자열 int변환은 parseint로
		
		Integer int2 = 100; //Integer은 java.lang의 선언문
		
		int a = Integer.parseInt("100");
		System.out.println(int2.intValue());
	}

}
