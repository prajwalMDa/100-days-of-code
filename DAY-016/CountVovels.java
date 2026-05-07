public class CountVovels {
    public static int numofvowels(String str){
        String vowels = "aeiou";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args){
        String paragraph = "aeiou";
        System.out.println(numofvowels(paragraph));
    }
}
