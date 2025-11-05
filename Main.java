package Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s=new Student();
		System.out.println(s.name);
		System.out.println(s.roll);
		s.name="Kaju";
		s.roll=34;
		System.out.println(s.name);
		System.out.println(s.roll);
		s.sayHi("rahul");
		s.sayHiwithoutthis("Honey");
	}
	static {
		System.out.println("Hello Mac");
		
	}
	

}
