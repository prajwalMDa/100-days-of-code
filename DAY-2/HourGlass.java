//Given positive integer n, print numeric pattern in form of an hourglass.

import java.util.Scanner;
public class HourGlass {
    public static void HG(int n){

        //upper half
        for(int i=1; i<=n; i++){
            
            //phase 1 (spacing)
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            //phase 2 - k runs from i to n in each loop
            for(int k=i; k<=n; k++){
                System.out.print(k+" ");
            } 
            System.out.println();
        }

        //lower half - inversion on upper 
        for(int i=n-1; i>=1; i--){
        
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int k=i; k<=n; k++){
                System.out.print(k+" ");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        HG(sc.nextInt());
    }


}
