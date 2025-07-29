package com.LSM.ch11_1_String;

public class ByteToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] bytes = {72,101,108,108,111}; //Hello 아스킨코드 값 배열
		char a;
		
		String str1 = new String(bytes);
		
		System.out.println(str1);
		
	}

}
