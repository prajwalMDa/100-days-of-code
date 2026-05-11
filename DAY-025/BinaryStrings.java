public class BinaryStrings {

    public static void printbinarystrings(int n, int last, String s){
        if(n==0){
            System.out.println(s);
            return;
        }

        if(last == 0){
            printbinarystrings(n-1, 0, s+"0");
            printbinarystrings(n-1, 1, s+"1");
        }else{
            printbinarystrings(n-1, 0, s+"0");
        }

    }
    public static void main(String[] args){
        System.out.println("\n");
        printbinarystrings(5, 0, new String(""));
        System.out.println("\n");

    }
}
