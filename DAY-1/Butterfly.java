//butterfly pattern using funcction method

import java.util.Scanner;
public class Butterfly {

    public static void structure(int n, int i){
            //1st phase star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //sec phase space
            for(int k=1; k<=(n*2)-(i*2); k++){
                System.out.print(" ");
            }

            //third phase star
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
    }


    public static void butterfly(int n){

        //first half
        for(int i=1; i<=n; i++){
            structure(n, i);
        }

        //sec half
        for(int i=n-1; i>=1; i--){
            structure(n, i);
        }
    }

    public static void main(String[] args){
        System.out.print("Enter the size of the butterfly: ");
        Scanner sc = new Scanner(System.in);
        butterfly(sc.nextInt());
    }
}
