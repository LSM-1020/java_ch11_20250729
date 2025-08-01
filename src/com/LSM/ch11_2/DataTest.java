package com.LSM.ch11_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date nowTime = new Date();
		System.out.println(nowTime.toString());
		
		SimpleDateFormat dateformat1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String date2 = dateformat1.format(nowTime);
		System.out.println(date2);
		String date3 = dateformat2.format(nowTime);
		System.out.println(date3);
		
		System.out.println(nowTime.getTime() + (2*3600*1000)); //현재시각 기준으로 2시간 후
		long newTime = nowTime.getTime() + (2*3600*1000);
		nowTime.setTime(newTime);
		System.out.println("지금부터 2시간후 : " + nowTime);
		
	}

}
