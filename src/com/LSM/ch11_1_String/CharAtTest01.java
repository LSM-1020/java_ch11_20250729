package com.LSM.ch11_1_String;

public class CharAtTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Korea";
		
		System.out.println(str.charAt(0)); //문자열에서 원하는 문자 하나만 반환해주는 매소드
		
		
		int count = 0;
		for(int i=0;i<str.length();i++) {
			
//			System.out.println(str.charAt(i));
			if(str.charAt(i) == 'o') {
				System.out.println("문자열 내 o가 포함됨");
				count ++;
			}
			
		}
		System.out.println(str + "문자열 내 o가 " + count + "번 포함됨");
	}

}
