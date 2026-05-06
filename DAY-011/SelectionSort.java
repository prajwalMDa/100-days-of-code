import java.util.Scanner;

public class SelectionSort {
    public static int[] selection(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            int min = i;

            //find minimum
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
            }

            //swap from starting
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;

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
        int[] sorted = selection(array);
        System.out.print("After sort: ");
        output(sorted);
        
    }
}
