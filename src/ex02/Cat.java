package ex02;

public class Cat {

	//멤버 변수 -- 재료 / 레시지
	
	//private 는 이 클래스 안에서만 사용가능
	private String bread;
	private String color;
	
	//멤버 변수 값을 대입 및 변경은
	//생성자를 이용 또는 setter를 이용해서 값을 변경이나 초기화 한다
	//getset 함수 setter는 변수값을 변경할떼 사용 getter는 변수값을 읽어올때 사용
	
	//setter -> set+변수명 조합 -> 카멜표기법
	
	
	//생성자(클래스하고 이름 같다) 반환타입X
	Cat(String s1, String s2){
		bread = s1;
		color = s2;
		
	}
	
	
	
	
	


	public void setColor(String c) {
		color = c;
	}




	public void setBread(String s1) {
		bread = s1;
	}

	//멤버 메서드 -- 액션
	void eat() {
//		System.out.println("나이는 " + age);
		System.out.println("츄르를 먹는다");
		System.out.println("칼라는 " + color + "이다.");
	}
	
	void scratch() {
		
	}
	
	void neow() {
		
	}
	
	

}
