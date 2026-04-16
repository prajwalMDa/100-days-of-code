// Question:
// Write a Java program to print the following pattern:
//
//       1
//      2*3
//     6*5*4
//    7*8*9*10
// 15*14*13*12*11
//
// Rules:
// 1. Numbers should be continuous
// 2. Each row contains row number of elements
// 3. Odd rows print in ascending order
// 4. Even rows print in descending order
// 5. Print '*' between numbers
// 6. Add leading spaces to align the pattern in triangular form

public class MulPattern {
    public static void pattern(int n){

        for(int i=1; i<=n; i++){
            //phase 1 - spacing
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }

            //phase 2 - nums
            if(i%2 == 0){
                //prints j to i
                for(int j=1; j<=i; j++){
                    if(j==i)System.out.print(j);
                    else System.out.print(j+"*");
                }
            }else{
                //prints j to i in reverse
                for(int j=i; j>=1; j--){
                    if(j==1)System.out.print(j);
                    else System.out.print(j+"*");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern(5);
    }
}
