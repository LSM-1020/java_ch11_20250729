package com.LSM.ch11_1;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member1 = new Member("tiger");
		Member member2 = new Member("tiger");
		Member member3 = new Member("monkey");
		
		if(member1.equals(member2)) {
			System.out.println("두 멤버의 id는 동일합니다");
			
		}else {
			System.out.println("동일하지 않습니다");
		}
		
		if(member1.equals(member3)) {
			System.out.println("두 멤버의 id는 동일합니다");
			
		}else {
			System.out.println("동일하지 않습니다");
		}
		//해쉬코드출력
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
		
	}

}
