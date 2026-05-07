import java.util.Arrays;
public class Anagrams {
    public static boolean isAnagrams(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();

        Arrays.sort(str1arr);
        Arrays.sort(str2arr);

        return (Arrays.equals(str1arr, str2arr));
    }

    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
        System.out.println(isAnagrams(str1, str2));
    }
}
