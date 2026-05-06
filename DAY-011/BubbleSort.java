import java.util.Scanner;
public class BubbleSort {
    public static int[] bubblesort(int[] nums){

        //compaire all elements and swap to end if large

        for(int turn=0; turn<nums.length-1; turn++){
            for(int j=0; j<nums.length-1-turn; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
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
        int[] sorted = bubblesort(array);
        System.out.print("After sort: ");
        output(sorted);
        
    }
}
