import java.util.Scanner;
public class conversion {
    public static void conversions(String[] arr, int num){
        if(num==0){
            return;
        }

        conversions(arr, num/10);
        int dig = num%10;
        System.out.print(arr[dig]+" ");     
    }

    public static int numrev(int n){
        int rev=0;
        while(n > 0){
            int dig = n%10;
            rev = (rev*10)+dig;
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.print("num: ");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("zero ");
        }else{
            conversions(numbers,n);
        }
        // int num = numrev(sc.nextInt());
        // conversions(numbers, num);
    }
}
