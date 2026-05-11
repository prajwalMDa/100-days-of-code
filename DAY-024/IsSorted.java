public class IsSorted {
    public static boolean issortedA(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return issortedA(arr, i+1);
    }

    public static boolean issortedD(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] < arr[i+1]){
            return false;
        }

        return issortedD(arr, i+1);
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 6, 9};
        System.out.println(issortedA(array, 0));
        System.out.println(issortedD(array, 0));
    }
}
