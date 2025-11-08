class bookCreater{
    String title;
    String author;
    int price;

    public bookCreater(){      //default constructor
        title="unknown";
        author="unknown";
        price=0;
    }
    public bookCreater(String title,String author,int price){ //parameterized constructor
        this.author=author;
        this.title=title;
        this.price=price;
    }
    public void PrintBook(){
        System.out.println("Title= "+title);
        System.out.println("Author= "+author);
        System.out.println("price= "+price);
    }
}
public class bookclass {
    public static void main(String[] args) {
        bookCreater b1=new bookCreater();
        System.out.println("these are parameters of b1 class by de");
        b1.PrintBook();
        bookCreater b2=new bookCreater("java","james gosling",500);
        b2.PrintBook();
        

    }
}
