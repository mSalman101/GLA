import java.util.*;
// import java.lang.reflect.Array;

class Animal {
void eat() {
System.out.println("Eating...");

}
int walk(){
    return 6;
}
}
class Dog extends Animal {
void bark() {
System.out.println("Barking...");
}
}
class Puppy extends Dog {
void weep() {
System.out.println("Weeping...");
}
}
public class Multilevel {
public static void main(String[] args){
    Dog d=new Dog();
    d.bark();
    Puppy p=new  Puppy();
    p.weep();
    p.bark();
    Animal a=new Animal();
    int km=a.walk();
    System.out.println(km);
    int pm=p.walk();
    System.out.println("Puppy  walk"+pm);
}
}
