/*# Reverse Array in Java

Write a Java program to:

* Take array size and elements from user
* Display array before reversing
* Reverse the array using a function
* Display array after reversing

**Example**

Input:
1 2 3 4 5

Output:
Before: [1, 2, 3, 4, 5]
After:  [5, 4, 3, 2, 1]
*/

import java.util.Scanner;

public class ReverseArray {

    //reversing function
    public static void reverse(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    //array output function
    public static void printarray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            if(i==array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.print("]");
    }


    //array input function
    public static int[] arrayinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int[] array = new int[sc.nextInt()];
        

        for(int i=0; i<array.length; i++){
            System.out.print("index "+i+": ");
            array[i] = sc.nextInt();
        }

        sc.close();
        return array;
    }

    //reversed array output function
    public static void reversedarray(int[] numbers){
        
        System.out.println("----before reverse----");
        printarray(numbers);

        reverse(numbers);
        System.out.println();

        System.out.println("----after reverse----");
        printarray(numbers);
        
    }


    //main
    public static void main(String[] args){
        reversedarray(arrayinput());
    }
}
