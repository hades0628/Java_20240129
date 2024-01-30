package ex03;

/*클래스 이름 sutdent
속성 name, studentId, major
기능 displayInformation() 학생의 모든 정보를 출력하는 메소드
초기화 생성자 이용, or setter 이용
*/

public class Student {
	private String name;
	private int studentId;
	private String major;
	
	Student(){}
	
	public Student(String n, int s,String m) {//인지값 3개를 받는것
		name = n;
		studentId = s;
		major = m;
	}
	
	void displayInformation() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentId);
		System.out.println("전공 : " + major);
	}

}
