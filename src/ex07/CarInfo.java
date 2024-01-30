package ex07;

public class CarInfo {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.displayCarInfo();
		
		System.out.println("-----------------");
		
		car.setCar("기아", "스포티지", 2024, "흰색");
		car.displayCarInfo();
		
		System.out.println("-----------------");
		car.setMake("기아");
		car.setModel("모하비");
		car.displayCarInfo();
	}

}
