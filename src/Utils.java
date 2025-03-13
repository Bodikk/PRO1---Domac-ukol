public class Utils {
    public static long GCD(long a,long b){
        while (b!=0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
