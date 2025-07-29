package com.LSM.ch11_1_2;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class cla = Car.class;
		
		System.out.println(cla.getName()); //패키지 포함 이름
		System.out.println(cla.getSimpleName()); //클래스 이름만
		System.out.println(cla.getPackageName()); //패키지 이름만
	}

}
