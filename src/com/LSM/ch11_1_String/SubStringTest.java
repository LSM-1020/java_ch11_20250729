package com.LSM.ch11_1_String;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String addr = "서울특별시 종로구 숭인동 111번지 306호 2층";
		
		String firstaddr = addr.substring(6, 9); 
		//endindex에 해당하는 문자는 추출되는 문자열에 포함안됨 따라서 9까지 해야 종로'구'까지 나옴
		System.out.println(firstaddr);
		String secondAddr = addr.substring(14); //endindex를 생략하면 시작index부터 끝까지 나타냄 
		System.out.println(secondAddr);
	}

}
