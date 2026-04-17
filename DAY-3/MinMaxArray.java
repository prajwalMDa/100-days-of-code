// Question:
// Write a Java program to find the largest and smallest element in an array.
//
// The program should:
// 1. Take array size as input
// 2. Take array elements from user
// 3. Find largest element in array
// 4. Find smallest element in array
// 5. Display both values
//
// Example:
// Array: [10 20 5 40 8]
// Output:
// max: 40
// min: 5

import java.util.Scanner;
public class MinMaxArray {

    //to find max element
    public static int Max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

    //  to find min element
    public static int Min(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }


    //imput function
    public static void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("size: ");
        int[] nums = new int[sc.nextInt()];

        for(int i=0; i<nums.length; i++){
            System.out.print("index "+i+": ");
            nums[i] = sc.nextInt();
            System.out.println();
        }

        System.out.print("[");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("]\n");
        System.out.println("max: "+Max(nums));
        System.out.println("min: "+Min(nums));

        sc.close();
    }

    //main
    public static void main(String[] args){
        input();
    }
}