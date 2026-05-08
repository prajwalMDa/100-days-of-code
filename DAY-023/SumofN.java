
public class SumofN {

    public static int sumoffirstn(int n){
        if (n==1){
            return 1;
        }

        int sum = n + sumoffirstn(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumoffirstn(5));
    }
}
