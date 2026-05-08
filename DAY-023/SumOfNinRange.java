public class SumOfNinRange {
    public static int sumofn_numbers(int start,int end){
        if(start==end){
           return end;
        }
        int sum = start + sumofn_numbers(++start, end);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofn_numbers(1, 5));
    }
}
