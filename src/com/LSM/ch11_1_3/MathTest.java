package com.LSM.ch11_1_3;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.abs(-10)); //절대값 계산
		
		System.out.println(Math.ceil(3.14)); //소수점 올림	
		System.out.println(Math.floor(3.14)); //소수점 내림
		System.out.println(Math.round(3.74)); //소수점 반올림 
		
		System.out.println(Math.max(5, 10)); //두개의 정수중 큰값 출력 
		System.out.println(Math.min(1.1, 10.1)); //두개의 실수중 작은값 출력
		
		System.out.println(Math.random()); //0~1까지의 수중 랜덤으로 1개 반환 0은 가능, 1은 불가능   
		System.out.println( Math.floor(Math.random() * 45 + 1)); //내림처리로 정수변환
		
		System.out.println(Math.rint(3.5)); //인수값에 가장 가까운 정수를 실수형으로 반환 ,반올림 
	}

}
