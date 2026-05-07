import java.util.Scanner;
public class Methods {
    public static int get(int n, int i){
        int bitmask = 1<<i;
        return ( (n & bitmask) == 0 ? 0 : 1 );
    }

    public static int set(int n, int i){
        int bitmask = 1<<i;
        return (n | bitmask);
    }

    public static int clear(int n, int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static int update(int n, int i, int bit){

        
        // int bitmask1= 1<<i;
        //int bitmask2= ~(1<<i);
        // return (bit = 1 ?(n | bitmask1): (n & bitmsk2));


        // if(bit == 0){
        //     n = n&  ~(1 << i);
        //     n = (bit << i) | n;
        //     return n;
        // }else{
        //     n = n | (1 << i);
        //     n = (bit << i) | n;
        //     return n;
        // }


        n = n & ~(1<<i);
        int bitmask = (bit<<i);
        return n|bitmask;
    }

    public static int clearibit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int clearrange(int n, int i, int j){
        int bitmask1 = (~0)<<(i+1);
        int bitmask2 = (1<<(j))-1;
        int bitmask = bitmask1 | bitmask2;
        return n & bitmask;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get bit
        System.out.print("GET BIT(number, index): ");
        System.out.println(get(sc.nextInt(), sc.nextInt()));

        //set bit
        System.out.print("SET BIT(number, index): ");
        System.out.println(set(sc.nextInt(), sc.nextInt()));

        //clear bit
        System.out.print("CLEAR BIT(number, index): ");
        System.out.println(clear(sc.nextInt(), sc.nextInt()));

        //update bit
        System.out.println("UPDATE BIT(number, index, bit): ");
        System.out.println(update(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        //clear i'th bits
        System.out.println("CLEAR I'TH BITs(number, index): ");
        System.out.println(clearibit(sc.nextInt(), sc.nextInt()));

        //clear in range
        System.out.println("CLEAR RANGE BITs(number, index i, index j): ");
        System.out.println(clearrange(sc.nextInt(), sc.nextInt(), sc.nextInt()));

    }
}
