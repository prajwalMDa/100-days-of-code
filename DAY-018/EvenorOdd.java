
public class EvenorOdd {
    public static void evenorodd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args){
        evenorodd(6);
        evenorodd(2);
        evenorodd(1);
        evenorodd(7);
    }
}
