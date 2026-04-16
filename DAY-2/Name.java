//ASCII art pattern for 'PRAJWAL' name

public class Name {

    //space
    public static void space(){
        System.out.print("  ");
    }
    
    //star
    public static void star(){
        System.out.print("**");
    }

    //gap btw two letters
    public static void gap(){
            for(int j=1; j<=4; j++){
                space();
            }
    }

    // square structure for P,R,A upper structure
    public static void box(int i){     
        for(int j=1; j<=4; j++){
            if(i==1 || i==4 || j==1 || j==4){
                star();
            }else{
                space();
            }
        }  
    }

    //UPPER half
    public static void upper(){
        for(int i=1; i<=4; i++){
            //P
            box(i);
            gap();

            //R
            box(i);
            gap();

            //A
            box(i);
            gap();

            //j
            for(int j=1; j<=4; j++){
                if(i==1 || j==4){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //W
            for(int j=1; j<=7; j++){
                if(j==1 || j==7){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //A
            box(i);
            gap();

            //L
            for(int j=1; j<=4; j++){
                if(j==1){
                    star();
                }else{
                    space();
                }
            }

            System.out.println();
        }
    }

    //LOWER half
    public static void lower(){
        for(int i=1; i<=4; i++){

            //P
            for(int j=1; j<=4; j++){
                if(j==1){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //R
            for(int j=1; j<=4; j++){
                if(j==i || j==1){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //A
            for(int j=1; j<=4; j++){
                if(j==1 || j==4){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //J
            for(int j=4; j>=1; j--){
                if(i==j || j==4){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //W
            for(int j=1; j<=7; j++){
                if(j==1 || j==7 || i==j-3 || j==5-i){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //A
            for(int j=1; j<=4; j++){
                if(j==1 || j==4){
                    star();
                }else{
                    space();
                }
            }
            gap();

            //L
            for(int j=1; j<=4; j++){
                if(i==4 || j==1){
                    star();
                }else{
                    space();
                }
            }

            System.out.println();
        }
    }

    //main funcn
    public static void main(String[] args){
        upper();
        lower();
    }
}
