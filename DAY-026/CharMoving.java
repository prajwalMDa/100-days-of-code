public class CharMoving {
    public static String charmoving(String str, int i, char key, StringBuilder sb1, StringBuilder sb2){
        if(i==str.length()){
            return sb1.toString()+sb2.toString();
        }
        
        if(key != str.charAt(i)){
            sb1.append(str.charAt(i));
        }else{
           sb2.append(str.charAt(i));
        }

        return charmoving(str, i+1, key, sb1, sb2);
    }
    public static void main(String[] args) {
        String str = "axbcd";
        System.out.println(charmoving(str, 0, 'x', new StringBuilder(""),  new StringBuilder("")));
    }
}
