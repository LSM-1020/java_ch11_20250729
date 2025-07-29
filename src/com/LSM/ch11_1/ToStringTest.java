package com.LSM.ch11_1;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob = new Object();
		System.out.println(ob.toString()); //object가 기본적으로 가지고있는것 tostring
		
//		Member member = new Member(); //id값 null
		Member member = new Member("Tiger"); //id값 tiger
		System.out.println(member.toString());
		System.out.println(member.id);
		
		Date date = new Date();
		System.out.println(date.toString());
	
	
	}

}
