class animal{
    public void eat() {
         System.out.println("eating.... ");
    }
}
        class dog extends animal {
            public void bark(){
                System.out.println("bark....");
            }
        }
    

public class Test {
   public static void main(String[] args) {
    dog d=new dog();
    d.eat();
    d.bark();
         
   } 
}
