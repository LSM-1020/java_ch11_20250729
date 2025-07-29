package com.LSM.ch11_1_2;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0 ; i<10000;i++) {
			System.out.println(i);
			if(i == 5000) {
//				break;
//				System.exit(i); //프로그램 종료
				
			}
		}
		System.out.println("for문 종료 후 출력되는 문장");
		
		System.out.println("======================");
		long time1 = System.nanoTime();//나노단위 초 걸린 계산 nanoTime
		long time1_m1 = System.currentTimeMillis();//밀리단위 초 걸린 계산 currentTimeMillis
		
		long sum = 0L;
		for(int i=1;i<=1000000;i++) {
			sum += i;
		}
		System.out.println(sum);
		long time2 = System.nanoTime();
		long time2_m1 = System.currentTimeMillis();
		System.out.println("======================");
		System.out.println(time2_m1 - time1_m1); 
		System.out.println(time2 - time1); 
	
	}

}
