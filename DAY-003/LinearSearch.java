// Question:
// Write a Java program to implement Linear Search.
//
// The program should:
// 1. Take size of array from user
// 2. Take array elements as input
// 3. Take a key element to search
// 4. Use Linear Search to find the key
// 5. Return index if found, otherwise return -1
// 6. Display whether element is found or not
//
// Example:
// Array: [2 5 8 10 3]
// Key: 8
// Output: found in index 2

import java.util.*;

public class LinearSearch {

    //finds key
    public static int linear(int[] nums, int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }

        return -1;
    }
    

    //taking input data
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array: ");
        int[] nums = new int[sc.nextInt()];

        for(int i=0; i<nums.length; i++){
            System.out.print("Element for index "+i+": ");
            nums[i] = sc.nextInt();
            System.out.println();
        }

        System.out.print("[");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("]\n");
        


        System.out.print("key: ");
        int index = linear(nums, sc.nextInt());
        if(index == -1){
            System.out.println("not found..");
        }else{
            System.out.println("found in index "+index);
        }

        sc.close();
    }

    //main
    public static void main(String[] args){
        input();
    }
}
