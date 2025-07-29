package com.LSM.ch11_2;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calNow = Calendar.getInstance(); 
		//Calendar는 추상매소드로 단독으로 객체 생성x(new못씀)
		//하지만 getInstance를 사용하여 객체를 만들수 있음
		
		int year = calNow.get(Calendar.YEAR); 
		int month = calNow.get(Calendar.MONTH)+1; //month는 +1을 해줘야 오늘달이 나옴
		int day = calNow.get(Calendar.DAY_OF_MONTH);
		
		int hour = calNow.get(Calendar.HOUR);
		int minute = calNow.get(Calendar.MINUTE);
		int second = calNow.get(Calendar.SECOND);
		
		System.out.println(year +"년" + month + "월" + day + "일");
		System.out.println(hour +"시" + minute + "분" + second + "초");
		
		//요일 출력하기
		int weekday = calNow.get(Calendar.DAY_OF_WEEK);	
		
		System.out.println("오늘의 요일 : " + weekday);
		System.out.println("오늘의 요일 : " + Calendar.TUESDAY);
		
		if(weekday == Calendar.TUESDAY) {
			System.out.println("화요일입니다");
		}else {
			System.out.println("화요일이 아닙니다");
		}
	}

}
