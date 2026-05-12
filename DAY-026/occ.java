
public class occ {

    public static void occurence(int[] arr, int key, int i){
        if(i == arr.length){
            return;
        }
        if(key == arr[i]){
            System.out.println(i);
        }
        occurence(arr, key, i+1);

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 5, 7, 2, 0};
        occurence(nums, 2, 0);
    }
}
