// Question:
// Write a Java program to print different numeric patterns using menu-driven choice.
//
// The program should allow the user to choose from the following patterns:
//
// 1. Number Pyramid
// Example (n = 5):
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
//
// 2. Palindromic Number Pattern
// Example (n = 5):
//     1
//    212
//   32123
//  4321234
// 543212345
//
// 3. Binary Tree Pattern (0 and 1)
// Example (n = 5):
//     1
//    0 1
//   1 0 1
//  0 1 0 1
// 1 0 1 0 1
//
// 4. Floyd's Triangle
// Example (n = 5):
//     1
//    2 3
//   4 5 6
//  7 8 9 10
// 11 12 13 14 15
//
// Requirements:
// 1. Use menu-driven program
// 2. Take user input for height
// 3. Use loops to generate patterns
// 4. Continue until user selects exit option

import java.util.Scanner;
public class Numpattern {

    //number pyramid pattern
    public static void NumberPyramid(int n){
        for(int i=1; i<=n; i++){

            //phase 1 (space)
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }

            //phase 2 (numbers -> i)
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    //palindromic pattern with numbers
    public static void PalindromicPattern(int n){
        for(int i=1; i<=n; i++){

            //phase 1 (space)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //phase 2 
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            for(int l=2; l<=i; l++){
                System.out.print(l);
            }

            System.out.println();
        }
    }

    //binary tree pattern (0,1)
    public static void BinaryTree(int n){
        for(int i=1; i<=n; i++){

            //phase 1 (space)
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }

            //phase 2
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //floyds tringle pattern
    public static void FloydsTriangle(int n){
        int x = 1;
        for(int i=1; i<=n; i++){

            //phase 1 (spacing)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //phase 2
            for(int k=1; k<=i; k++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        
    }

    //choice function
    public static void choose(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println();
            System.out.println("1-> number pyramid");
            System.out.println("2-> palindromic pattern");
            System.out.println("3-> binary tree");
            System.out.println("4-> floyds tringle");
            System.out.println("5 -> stop");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter the height of pyramid: ");
                NumberPyramid(sc.nextInt());
            }else if(choice == 2){
                System.out.print("Enter the length of pattern: ");
                PalindromicPattern(sc.nextInt());
            }else if(choice == 3){
                System.out.print("Enter the height of binary tree: ");
                BinaryTree(sc.nextInt());
            }else if(choice == 4){
                System.out.print("Enter the height of floyds pattern: ");
                FloydsTriangle(sc.nextInt());
            }else if(choice == 5){
                System.out.print("\nstopping...\n");
            }else{
                System.out.print("\ninvalid input...\n");
            }
        }while(choice != 5);

        sc.close();
    }





    public static void main(String[] args){
        choose();
    }
}
