package ex07;

public class Car {

	private String make;
	private String model;
	private int year;
	private String color;
	
	private boolean engine;
	
	//setter
	void setMake(String m) {
		make = m;
	}
	void setModel(String mo) {
		model = mo;
	}
	void setYear(int y) {
		year = y;
	}
	void setColor(String c) {
		color = c;
	}
	
	
	void setCar(String m, String mo, int y, String c) {
		make = m;
		model = mo;
		year = y;
		color = c;
	}
	
	void displayCarInfo() {
		System.out.println("제조사 :" + make);
		System.out.println("모델 :" + model);
		System.out.println("제조년도 :" + year);
		System.out.println("색상 :" + color);
	}


	boolean startEngine(){
		return engine = true;
	}

	boolean stopEngine(){
		return engine = false;
	}

	/*
	 * public Car() { // 기본 생성자 내용 추가 }
	 */
//	public Car(String m, String mo, int y, String c) {
//		make = m;
//		model = mo;
//		year = y;
//		color = c;
//	}
//
//	public Car() {
//		this("기아", "스포티지", 2024, "흰색");
//	}

	
}
