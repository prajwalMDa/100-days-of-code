import java.util.Scanner;
public class LengthofString {
    public static int length(String str){
        
        if(str.equals("")){
            return 0;
        }
       
        return 1 + length(str.substring(1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("str? :");
        System.out.println(length(sc.next()));
    }
}
