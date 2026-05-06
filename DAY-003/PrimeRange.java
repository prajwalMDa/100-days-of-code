import java.util.Scanner;

public class PrimeRange {

    public static boolean isprime(int num){
        if(num<=1){
            return false;
        } 
        for(int i=2; i<=(int)Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void Range(int range){
        for(int i=1; i<=range; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Range: ");
        Range(sc.nextInt());
        sc.close();
    }
}
