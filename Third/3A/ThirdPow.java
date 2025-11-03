public class ThirdPow{
    public static int  pow(int n,int b){
            if(b==1){
                return n;
            }
            return n*pow(n,b-1);
    }
    public  static void main(String arg[]){
       int ans=pow(2,3);
        System.out.println(ans); ///2*2*2
    }
}