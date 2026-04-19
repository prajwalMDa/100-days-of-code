/*Question:

Given an integer array, find the maximum sum among all subarrays.
Time Complexity = O(n²)

Example:
Input:
array = {1, -2, 6, -1, 3}

Output:
8

Explanation:
Subarrays:
{1} → 1  
{1,-2} → -1  
{1,-2,6} → 5  
{6,-1,3} → 8  ← Maximum

Return:
8

Function Signature:
public static int maxSubarray(int[] array)
*/

import java.util.Scanner;
public class Subarray{
    public static int[] subarrays(int[] array){

        //array to store sum of subarrays
        int count = (array.length*(array.length+1))/2;
        int[] sumarray = new int[count];
        int index = 0;

        //array to store prefix array
        int[] prefix = new int[array.length];
        prefix[0] = array[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        } 

        //loop to fill sum of subarrays with current sum
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                int currentsum = 0;
                currentsum = (i==0)? prefix[j] : prefix[j] - prefix[i-1];

                sumarray[index] = currentsum;
                index++;
            }
        }

        return sumarray;

    }

    //array for user
    public static int[] inputarray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size ? : ");
        int[] array = new int[sc.nextInt()];

        for(int i=0; i<array.length; i++){
            System.out.print("index "+i+" : ");
            array[i] = sc.nextInt();
        }

        return array;
        
    }

    //main
    public static void main(String[] args){
        int[] sumarray = subarrays(inputarray());

        System.out.print("[ ");
        for(int i=0; i<sumarray.length; i++){
            if(i==sumarray.length-1){
                System.out.print(sumarray[i]);
            }else{
                System.out.print(sumarray[i]+",");
            }
            
        }
        System.out.print(" ]");
    }
}