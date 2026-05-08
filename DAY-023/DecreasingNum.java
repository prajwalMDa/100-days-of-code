public class DecreasingNum{
    public static void decreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        
        System.out.print(n+" ");
        decreasing(n-1);
    }

    public static void increasing(int n){
        if(n == 100){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        increasing(n+1);
    }
    public static void main(String[] args) {
        decreasing(100);
        System.out.println("\n");
        increasing(1);

       
    }
}