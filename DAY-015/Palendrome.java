public class Palendrome {
    public static boolean palendrome(String str){
        // int start = 0;
        // int end = str.length()-1;
        // while(start<end){
        //     int first = str.charAt(start)+str.charAt(start+1);
        //     int last  = str.charAt(end)+str.charAt(end-1);
        //     if(first != last){
        //         return false;
        //     }
        //     start+=2;
        //     end-=2; 
        // }
        // return true;

        int n = str.length()-1;
    
        for(int i=0; i<=str.length()/2 ; i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "amma";
        System.out.println(palendrome(str));
    }
}
