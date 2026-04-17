// Question:
// Given a positive integer n, write a Java program to print a numeric
// hourglass pattern as shown below:
//
// Example (n = 5):
//
//  1 2 3 4 5
//   2 3 4 5
//    3 4 5
//     4 5
//      5
//     4 5
//    3 4 5
//   2 3 4 5
//  1 2 3 4 5
//
// Rules:
// 1. Pattern should form an hourglass shape
// 2. Numbers increase from left to right
// 3. Upper half prints decreasing rows
// 4. Lower half prints increasing rows
// 5. Use spaces to properly align the hourglass

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

        sc.close();
    }


}
