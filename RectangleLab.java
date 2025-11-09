package Rectangle;
import java.util.Scanner;
class rectangle{
	private double l;
	private double b;
	//Function Syntax  for taking lenght and breadth from CLI
	public void readDimensions() {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		l=sc.nextDouble();
		System.out.println("Enter the breadth");
		b=sc.nextDouble();
	}
	//Function for Area
	public void getArea() {
		System.out.println("Area is = "+ l*b);
		
	}
	public void ShowData() {
		System.out.println("Length of rectangle is = "+l);
		System.out.println("Length of rectangle is = "+b);
		System.out.println("Area of Rectangle is  = "+(l*b));
	}
}
public class RectangleLab {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle();
		r1.readDimensions();
		r1.getArea();
	}
}
