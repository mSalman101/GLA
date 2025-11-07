class book{
    String title;
    String author;
    int price;
    //default constructor 
    public book(){
        System.out.println("Default constructor called");
        this.title="unknown";
        this.author="unknown";
        this.price=0;
    }
    public book(String title,String author,int price){
        this.author=author;
        this.price=price;
        this.title=title;
    }
    public void displayBookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

}
public class Library1 {
    public static void main(String[] args) {
        book b1=new book();
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println(b1.title);
        book jungle=new book("JungleBook","Harry",300);
        jungle.displayBookDetails();
        
    }
}
