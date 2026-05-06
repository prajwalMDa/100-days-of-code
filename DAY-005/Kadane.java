/*Problem — Maximum Subarray Sum

Given an integer array nums, find the maximum sum of a contiguous subarray.

Example 1:
Input:
nums = [5, -2, 3, 4]

Output:
10

Example 2:
Input:
nums = [-2, -3, -1, -5]

Output:
-1

Constraints:
- Array size ≥ 1
- Elements can be positive, negative, or zero

Function Signature:
public static int maxSubarray(int[] nums) */


import java.util.Scanner;
public class Kadane {

    public static int kadane(int[] array){
        
        int max = Integer.MIN_VALUE;
        int currentsum = 0;

        for(int i=0; i<array.length; i++){
            if(currentsum<0){
                currentsum = 0;
            }
            currentsum += array[i];
            max = Math.max(currentsum, max); 
        }
        return max;
    }

    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size ? : ");
        int[] array = new int[sc.nextInt()];

        for(int i=0; i<array.length; i++){
            System.out.print("index "+i+" : ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void main(String[] args){
        System.out.println("maximum: "+kadane(input()));
    }
 
}
