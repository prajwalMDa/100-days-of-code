import java.util.Scanner;

public class Countingsort {
    public static int[] counting(int[] nums){
        int max = Integer.MIN_VALUE;

        //find largest
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        //store frequency on new counting array
        int[] count = new int[max+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        //add frequency to current array
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;
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
        int[] sorted = counting(array);
        System.out.print("After sort: ");
        output(sorted);
        
    }
}
