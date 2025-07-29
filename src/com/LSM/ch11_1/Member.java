package com.LSM.ch11_1;

public class Member {

	public String id;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String id) {
		super();
		this.id = id;
	}
	//객체를 인수로받아서 그 객체가 Member 클래스로 만든 객체인지 확인하여 맞으면 member객체로 다운캐스팅 후
	//그안에있는 id필드를 꺼내서 본인 객체가 가지고있는 id값과 비교하여 같으면 true 아니면 false로 출력하는 메소드로 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member	= (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		
		}
		
		return false;
	}
	@Override
	public String toString() {
		return id;
	}
	
	
	
}

