package ex06;

public class BookInfo {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	public BookInfo() {
		this("제목", "저자", "출판사 없음", 0);
	}
	
	public BookInfo(String t, String a, int p) {
		this(t, a, "출판사 없음", p);
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
