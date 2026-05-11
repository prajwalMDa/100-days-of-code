public class XpowN {

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int xpn = x * power(x, n-1);
        return xpn;
    } 

    public static int optiPower(int x, int n) {
        if(n==0){
            return 1;
        }

        int halfpow = optiPower(x, n/2);
        int pow = halfpow * halfpow;

        if(n%2 != 0){
            pow = x * pow;
        }
        // int pow = (n % 2 ==0)
        // ? optiPower(x, n/2) * optiPower(x, n/2) 
        // : x * optiPower(x, n/2) * optiPower(x, n/2);
       

        return pow;

    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optiPower(2, 10));
    }
}
