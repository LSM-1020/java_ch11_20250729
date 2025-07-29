package com.LSM.ch11_1_String;

public class IndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "대한민국 일본";
		
		int index = str.indexOf("일본");
		System.out.println(index); //일본이 시작되는 index는 5
		
		if(str.indexOf("민국") != -1) { //일치하는 문자열을 찾지못하면 -1이 반환
			System.out.println("민국이 포함되어 있습니다.");
		}else {
			
			System.out.println("민국이 포함되어있지 않습니다.");
		}
		
		System.out.println(str.length()); //띄어쓰기도 글자수에 포함
	}

}
