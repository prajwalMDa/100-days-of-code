/*# Print All Subarrays

Write a Java program to print all possible subarrays of a given array.

* Take array size and elements from user
* Print all possible subarrays in readable format

**Example**

Input:
1 2 3

Output:
Subarrays:
[1] [1, 2] [1, 2, 3]
[2] [2, 3]
[3]
 */
import java.util.Scanner;
public class SubArray{

    //subarray function
    public static void subarray(int[] array){
        System.out.println("Subarrays:");
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    if(k==j){
                        System.out.print(array[k]);
                    }else{
                        System.out.print(array[k]+", ");
                    }
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }

    //function to take array form user
    public static int[] arrayinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int[] array = new int[sc.nextInt()];

        for(int i=0; i<array.length; i++){
            System.out.print("index "+i+": ");
            array[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
        return array;
    }
    
    
    //main
    public static void main(String[] args){
        subarray(arrayinput());
    }
}