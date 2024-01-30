package ex02;

import java.util.Scanner;

public class Exampler01 {

	public static void main(String[] args) {
		
	
		
		//Cat이란 클래스를 통해서 c1이란 참조변수가 참조하는 객체를 생성함
		Cat c1 = new Cat("페르시안고양이", "횐색");
		//c1.bread = "페르시안고양이";
		//c1.color = "흰색";
		//c1.setAge(10);
		
		c1.eat();
		
		Cat c2 = new Cat("코리안숏헤어","검정");
		//c2.bread = "코리안숏헤어";
		//c2.color = "검정";
		
		c2.eat();
		
		c2.setBread("러시안블루");
		c2.eat();
		
	}

}
