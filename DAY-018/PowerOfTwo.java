import java.util.Scanner;
public class PowerOfTwo {
    public static boolean ispoweroftwo(int n){
        // if the number is power of two 1000
        // the previous number of power of two will 111
        // hence if we & that we will get 0 
        // if 0 the number is power of two

        return (n & (n-1)) == 0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(ispoweroftwo(sc.nextInt()));
    }
}
