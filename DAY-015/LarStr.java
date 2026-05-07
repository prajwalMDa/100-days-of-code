public class LarStr {
    public static String largeststring(String[] array){
        String largest = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i].compareToIgnoreCase(largest) >= 0){
                largest = array[i];
            }
            // if(x == 0){
            //     largest = array[i];
            // }else if(x > 0){
            //     largest = array[i];
            // }
        }
        return largest;
    }
    public static void main(String[] args){
        String[] fruits = {"apple", "mango", "banana"};
        System.out.println(largeststring(fruits));
    }
}
