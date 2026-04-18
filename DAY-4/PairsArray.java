/*## Problem: Pair Sum

Given an array of integers and a target value, print all unique pairs whose sum equals the target.

### Input:
n  
array elements  
target  

### Output:
Print pairs [a, b] where a + b = target

### Example:
Input:  
5  
1 2 3 4 5  
6  

Output:  
[1,5]  
[2,4]  

### Task:
Solve using brute force (O(n²)) and try optimizing it.*/

import java.util.Scanner;
public class PairsArray{
    public static void pairsofarray(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("[");
                System.out.print(numbers[i]+","+numbers[j]);
                System.out.print("] ");
            }
            System.out.println();
        }
    }

    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int[] nums = new int[sc.nextInt()];

        for(int i=0; i<nums.length; i++){
            System.out.print("Index "+i+": ");
            nums[i] = sc.nextInt();
            System.out.println();
        }

        System.out.print("[");
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1){
                System.out.print(nums[i]);
            }else{
                System.out.print(nums[i]+", ");
            }
            
        }
        System.out.print("]");
        System.out.println();
        System.out.println();

        pairsofarray(nums);
    }
    public static void main(String[] args) {
        input();
    }
}