import java.util.Scanner;

public class InsertionSort {
    public static int[] insertion(int[] nums){
        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            int previous = i-1;

            //get position to insert
            while(previous>=0 && nums[previous] > current){
                nums[previous+1] = nums[previous];
                previous--;
            }

            //add temp current on the previous index
            nums[previous+1] = current;
        }
        return nums;
    }

    //output function
    public static void output(int[] array){
        for(int i=0; i<array.length; i++){
            if(i==array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i]+" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size? : ");
        int[] array = new int[sc.nextInt()];
        for(int i=0; i<array.length; i++){
            System.out.print("Index "+i+"? :");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Before sort: ");
        output(array);
        
        System.out.println();
        int[] sorted = insertion(array);
        System.out.print("After sort: ");
        output(sorted);
        
    }
}
