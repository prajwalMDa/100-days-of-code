public class Countzero {
    public static int countzeros(int n){
        
        if(n == 0){
            return 0;
        }
        int dig = n % 10;
        int count = dig == 0 ? 1 : 0;

        return count + countzeros(n/10);

    }

    public static void main(String[] args) {
        System.out.println(countzeros(1000));
    }
}
