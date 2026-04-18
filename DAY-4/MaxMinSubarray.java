/*# Maximum and Minimum Subarray Sum (Brute Force)

Write a Java program to find the **maximum** and **minimum** subarray sum using the **brute force method**.

* Take array size and elements from user
* Generate all possible subarrays
* Calculate sum of each subarray
* Display all subarrays and their sums
* Find and display maximum and minimum subarray sum

**Example**

Input:
1 2 3

Output:
Subarrays:
[1] [1,2] [1,2,3] [2] [2,3] [3]

Sum of Subarrays:
[1, 3, 6, 2, 5, 3]

Maximum: 6
Minimum: 1
 */
import java.util.Scanner;
public class MaxMinSubarray {
    
    public static int[] subarraysum(int[] array){

        int numofindex = (array.length*(array.length+1))/2;
        int index = 0;
        int[] sumarray = new int[numofindex];

        System.out.print("Subarrays:");
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                int sum = 0;
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    if(k==j){
                        System.out.print(array[k]);
                        sum+=array[k];
                    }else{
                        System.out.print(array[k]+",");
                        sum+=array[k];
                    }                    
                }
                System.out.print("]  ");
                sumarray[index] = sum;
                index++;
            }
        }
        System.out.println();
        return sumarray;
    }

    //input array form user
    public static int[] inputarray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int[] numarray = new int[sc.nextInt()];

        for(int i=0; i<numarray.length; i++){
            System.out.print("Index "+i+": ");
            numarray[i] = sc.nextInt();
        }
        System.out.println();
        return numarray;
    }

    //calculating maximum and minimum
    public static void maxmin(int[] sumarray){

        System.out.print("Sum of SubArrays:");
        System.out.print("[");
        for(int i=0; i<sumarray.length; i++){
            if(i==sumarray.length-1){
                System.out.print(sumarray[i]);
            }else{
                System.out.print(sumarray[i]+", ");
            }
        }
        System.out.print("]");

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<sumarray.length; i++){
            if(max < sumarray[i]){
                max = sumarray[i];
            }
            if(min > sumarray[i]){
                min = sumarray[i];
            }
        }

        do{
            System.out.println();
            System.out.println("1 -> maximum");
            System.out.println("2 -> minimum");
            System.out.println("3 -> exit");
            System.out.print("enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("maximum: "+max);
                    break;
                case 2:
                    System.out.println("minimum: "+min);
                    break;
                case 3:
                    System.out.println("exiting..");
                    break;
                default:
                    System.out.println("invalid input, try again..");
            }
        }while(choice != 3);

    }

    public static void main(String[] args) {
        maxmin(subarraysum(inputarray()));
    }

}
