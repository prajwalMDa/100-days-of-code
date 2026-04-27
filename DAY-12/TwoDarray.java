
import java.util.Scanner;
public class TwoDarray{

    //scan
    public static int[][] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int n = sc.nextInt();
        int[][] nums = new int[m][n];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        return nums;
    }

    //Output
    public static void output(int[][] nums){
        System.out.println();
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

    //search
    public static void search(int[][] nums, int key){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(key == nums[i][j]){
                    System.out.print("Key found at index "+i+" , "+j);
                    return;
                }
            }
        }
    }

    //max and min
    public static void maxmin(int[][] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                max = Math.max(max, nums[i][j]);
                min = Math.min(min, nums[i][j]);
            }
        }

        System.out.println();
        System.out.println("MAX : "+max);
        System.out.println("MIN : "+min);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] array = input();
        output(array);
        maxmin(array);
        System.out.print("Enter key: ");
        search(array, sc.nextInt());
    }
}
