

public class Toupper {
    public static void main(String[] args){
        String name = "my name is prajwal devali";

        //forward cheak approach
        // StringBuilder sb = new StringBuilder(name);
        // sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        // for(int i=0; i<sb.length()-1; i++){
        //     if(sb.charAt(i) == ' ' && sb.charAt(i+1) != ' '){
        //         sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
        //     }
        // }
        // System.out.println(sb);

        
        //backward cheak approach
        if(name.length() == 0){
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(name.charAt(0)));
        for(int i=1; i<name.length(); i++){
            if(name.charAt(i-1) == ' ' && name.charAt(i) != ' '){
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else{
                sb.append(name.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
