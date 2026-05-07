public class LongStr {
    public static String longeststring(String[] strs){
        int max = Integer.MIN_VALUE;
        String maxstring = "";
        for(int i=0; i<strs.length; i++){
            if(strs[i].length() > max){
                max = strs[i].length();
                maxstring = strs[i];
            }
        }

        return maxstring;
    }

    public static void main(String[] args){
        String[] strs = {"apple", "mango", "banana"};
        System.out.println(longeststring(strs));
    }
}
