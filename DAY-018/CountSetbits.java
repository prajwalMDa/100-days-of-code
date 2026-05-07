import java.util.Scanner;
public class CountSetbits {
    public static int countsetbits(int n){
        int count = 0;
        int bitmask = 1;
        while(n != 0){
            if((bitmask & n) != 0){
                count++;
            }

            n >>= 1; 
        }

        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        System.out.println(countsetbits(sc.nextInt()));
    }
}
