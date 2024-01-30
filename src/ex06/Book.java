package ex06;

public class Book {

	public static void main(String[] args) {
		
		BookInfo b1 = new BookInfo(
				"이게 모야",
				"나",
				"한빛",
				10000
				
				);
		b1.displayBookInfo();
		
		System.out.println("\n--------------");
		BookInfo b2 = new BookInfo();
		b2.displayBookInfo();
		System.out.println("\n--------------");
		BookInfo b3 = new BookInfo();
		b3.displayBookInfo();

	}

}
