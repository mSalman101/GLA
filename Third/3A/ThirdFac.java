public class ThirdFac {
    public  static int Factorial(int n){
    if (n == 0) {
        return 1;
}
    return n * Factorial(n - 1);
}
    public static void main(String[] args) {
        System.out.println("This is answer "+Factorial(5));
    }
}
