class book {
        	private String title;
	private String author;
	private int price;
	
	//Default constructor 
	public book() {
		this.title="unknown";
		this.author="unknown author";
		this.price=0;
	}
	//parameterized constructor
	public book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	//getter 
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getprice() {
		return price;
	}
	
	//setter
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    }
public class Library {
    public static void main(String[] args) {
        book b1=new book();
        System.out.println("b1 details:");
        b1.displayBookDetails();
        book jungle=new book("The Jungle Book","Ruskin Bond",250);
        System.out.println("\nJungle Book details:");
        jungle.displayBookDetails();
        jungle.setPrice(300);
        jungle.setAuthor("Rudyard Kipling");
        jungle.setTitle("The Jungle Book - Revised Edition");
        System.out.println("\nUpdated Jungle Book details:");
        jungle.displayBookDetails();
        System.out.println("This is the Library class.");
    }
    
}
