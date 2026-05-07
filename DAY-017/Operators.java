

public class Operators {

    public static void or(int a, int b){
        // bitwise or
        int bit = a | b;
        System.out.println(a +" & "+ b +" = "+bit);
    }

     public static void and(int a, int b){
        // bitwise and
        int bit = a & b;
        System.out.println(a +" | "+ b +" = "+bit);
    }

    public static void xor(int a, int b){
        // bitwise xor
        int bit = a ^ b;
        System.out.println(a +" ^ "+ b +" = "+bit);
    }

    public static void onescompliment(int n){
        //ones compliment
        int bit = ~n;
        System.out.println("ones compliment of "+n+" is "+bit);
    }

    public static void leftshift(int n, int shift){
        //bitwise leftshift
        int bit = n<<shift;
        System.out.println(n +" << "+ shift +" = "+bit);
    }

    public static void rightshift(int n, int shift){
        //bitwise rightshift
        int bit = n>>shift;
        System.out.println(n +" >> "+ shift +" = "+bit);
    }

    public static void main(String[] args){
        System.out.println();
      or(7, 3);
      System.out.println();
      and(7, 3);
      System.out.println();
      xor(7, 3);
      System.out.println();
      onescompliment(7);
      System.out.println();
      leftshift(7, 3);
      System.out.println();
      rightshift(7, 3);
      System.out.println();

    }
}
