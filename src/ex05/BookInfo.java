package ex05;

public class BookInfo {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	public BookInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public BookInfo(String t, String a, int p) {
		title= t;
		author = a;
		price = p;
		publisher = "한빛";
	}
	
	public BookInfo(String t, String a, String ps, int p) {
		title = t;
		author = a;
		publisher = ps;
		price = p;
	}
	
	void displayBookInfo() {
		System.out.print("제목: " + title);
		System.out.print("\n저자: " + author);
		System.out.print("\n출판사: " + publisher);
		System.out.print("\n가격: " + price);
	}
	
}
