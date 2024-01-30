package ex01;

public class Cat {

	//멤버 변수 -- 재료 / 레시지
	
	//private 는 이 클래스 안에서만 사용가능
	private String bread;
	private String color;
	
	//int age;
	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int n) {
//		if(age>0 && age<=15)
//			age = n;
//		else
//			System.out.println("나이는 0~15사이");
//	}

	//생성자(클래스하고 이름 같다) 반환타입X
	Cat(){
		System.out.println("디폴트 생성자");
		
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
