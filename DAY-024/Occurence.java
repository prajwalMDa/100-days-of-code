public class Occurence {
    public static int firstoccurence(int[] arr, int i, int key){

        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        
        return firstoccurence(arr, i+1, key);
    }

    public static int lastoccurence(int[] arr, int i, int key){
        if(arr.length-1-i == -1){
            return -1;
        }

        if(arr[arr.length-1-i] == key){
            return arr.length-1-i;
        }

        return lastoccurence(arr, i+1, key);
    }

    public static int isfoutopti(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }

        int isfound = isfoutopti(arr, i+1, key);

        if(isfound == -1 && arr[i] == key){
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 2, 67, 2};
        System.out.println(firstoccurence(array, 0, 2));
        System.out.println(lastoccurence(array, 0, 2));
        System.out.println(isfoutopti(array, 0, 2));
    }
}
