//----pattern printing diamond----

import java.util.Scanner;
public class Diamond{
    
    public static void diamond(int n){

        //first half
        for(int i=1; i<=n; i++){
            //gap
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k=1; k<=i+(i-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }

        //sec half (inverted of first half)
        for(int i=n-1; i>=1; i--){
            //gap
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k=1; k<=i+(i-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }

        
    }

    //main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of diamond: ");
        diamond(sc.nextInt());
        sc.close();
    }
}