public class Swap {
    public static void swaptwovariable(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a is :"+a+" and b is: "+b);
    }

    public static void main(String[] args){
        swaptwovariable(12, 23);
    }

}
