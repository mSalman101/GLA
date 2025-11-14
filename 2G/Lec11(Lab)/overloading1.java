// Overloading
// AP to implement method overloading in Java
class SimpleCalculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class overloading1 {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
 
        // Adding two integers
        int sumInt = calculator.add(10, 20);
        System.out.println("Sum of 10 and 20 (integers): " + sumInt);
 
        // Adding two doubles
        double sumDouble = calculator.add(10.5, 20.3);
        System.out.println("Sum of 10.5 and 20.3 (doubles): " + sumDouble);
 
        // Adding three integers
        int sumThreeInt = calculator.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15 (three integers): " + sumThreeInt);
    }
}
