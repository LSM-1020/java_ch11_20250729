package com.LSM.ch11_1_String;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "길동이는 순신이보다 키가 큽니다. 하지만 순신이가 길동이보다 말을 잘합니다";//길동을 유신으로 바꾸기
		String replaceStr = str.replace("길동","유신"); //replace는 원본을 수정하지는 않음 즉 새로 생성해야함
		System.out.println(replaceStr);
	}

}
