public class PairFriends {
    public static int pair(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }

        int single = pair(n-1);
        int mingle = pair(n-2);

        int total = single + ((n-1)*mingle);

        return total;
    }
    public static void main(String[] args) {
        System.out.println(pair(5));
    }
}
