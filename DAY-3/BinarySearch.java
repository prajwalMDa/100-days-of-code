// Question:
// Write a Java program to implement Binary Search.
//
// The program should:
// 1. Take the size of the array as input
// 2. Take array elements in increasing (sorted) order
// 3. Take a key element to search
// 4. Use Binary Search algorithm to find the key
// 5. Return the index if key is found
// 6. Return -1 if key is not found
//
// Example:
// Array: [10 20 30 40 50]
// Key: 30
// Output: Found in index 2
//
// Note:
// Binary Search works only on sorted arrays.


import java.util.Scanner;

public class BinarySearch {

    //finding key using binary search
    public static int Binary(int[] nums, int key){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid] == key){
                return mid;
            }else if(nums[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    //taking inputs
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.println("\n----elements should be in increasing order----\n");
        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter element of index "+i+": ");
            numbers[i] = sc.nextInt(); 
            System.out.println();
        }
        

        System.out.print("[");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.print("]\n");

        System.out.print("key: ");
        int index = Binary(numbers, sc.nextInt());

        if(index == -1){
            System.out.print("not found..!!");
        }else{
            System.out.print("Found in index "+index);
        }

        sc.close();
    }
    public static void main(String[] args){
       input();
    }
}
