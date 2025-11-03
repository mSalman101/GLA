public class ThirdDecr {
    public  static  void Prd(int n){
        if(n==1){
            System.out.print(1+" ,");
            return;
        }
        // System.out.print(n+",");
        Prd(n-1);
                System.out.print(n+" ,");
    }
    public static void main(String[] args) {
        Prd(9);
    }
}
