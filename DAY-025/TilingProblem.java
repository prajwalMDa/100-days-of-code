import java.util.Scanner;
public class TilingProblem {
    public static int ways(int n){
        if(n==1 || n==0){
            return 1;
        }

        //vertical
        int w1 = ways(n-1);

        //horizontal
        int w2 = ways(n-2);


        int total = w1+w2;
        return total;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for tile space 2 x n : ");
        System.out.println(ways(sc.nextInt()));
    }
}
