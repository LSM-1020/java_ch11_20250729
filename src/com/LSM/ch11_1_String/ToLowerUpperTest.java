package com.LSM.ch11_1_String;

public class ToLowerUpperTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "KOREA";
		String str2 = "Japan";
		String str3 = "JAPAN";
		
		System.out.println(str1.toLowerCase()); // 모두 소문자로 변경 ->원본은 수정하지 않음
		System.out.println(str1);
		System.out.println(str2.toUpperCase()); // 모두 대문자로 변경 ->원본은 수정하지 않음
		System.out.println(str2);
		
		str2 = str2.toUpperCase(); //대문자로 변환후 덮어쓰기
		if(str2.equals(str3)) {
			System.out.println("두 문자열은 같다");
		}else {
			System.out.println("두 문자열은 다르다");
		}
		
		//equalsIgnoreCase -> 대소문자구분하지 않음, 이걸로쓰면 ture
		
}
}