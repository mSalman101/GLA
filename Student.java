package Student;

public class Student {
	int roll;
	String name;
	
	public void intro() {
		System.out.println("My name is "+ name+"and roll is"+roll);
	}
	public void sayHi(String name) {
		System.out.println(this.name+" said hello to "+ name);
	}
	public void sayHiwithoutthis(String name) {
		System.out.println(name+" said hello to "+ name);
	}
}
