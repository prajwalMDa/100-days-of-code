import java.util.Scanner;
public class HollowShapes {

    //printing hollow rectangle of n x (nx2)
    public static void HollowRectangle(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2; j++){
                if(i==1 || i==n || j==1 || j==n*2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }




    //printing hollow triangle
    public static void HollowTriangle(int n){
        for(int i=1; i<=n; i++){
            //1st phase space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //2nd phase star
            for(int k=1; k<=i+(i-1); k++){
                if(i==1 || i==n || k==1 || k==i+(i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    //printing hollow diamond
    public static void Structure(int n, int i){
        //1st phase space
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        //sec phase star
        for(int k=1; k<=i+(i-1); k++){
            if(i==1 || k==1 || k==i+(i-1)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
    }
    public static void HollowDiamond(int n){
        //first half
        for(int i=1; i<=n; i++){
            Structure(n, i);
            System.out.println();
        }
        //sec half
        for(int i=n-1; i>=1; i--){
            Structure(n, i);
            System.out.println();
        }

    }


    //------------------function to choose specific shape---------------------
    public static void choice(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("1-> Hollow rectangle:");
            System.out.println("2-> Hollow Triangle:");
            System.out.println("3-> Hollow Diamond:");
            System.out.println("4->Exit");

            System.out.print("Enter your choice:");
            choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.print("Enter the length of rectangle: ");
                    HollowRectangle(sc.nextInt());
                    break;
                }
                case 2:{
                    System.out.println("Enter the side of triangle: ");
                    HollowTriangle(sc.nextInt());
                    break;
                }
                case 3:{
                    System.out.println("Enter the diagonal of diamond: ");
                    HollowDiamond(sc.nextInt());
                    break;
                }
                case 4:{
                    System.out.println("\nExiting....");
                    break;
                }
                default:{
                    System.out.println("\nivalid input....\n");
                }

            }

            sc.close();
        }while(choice!=4);
            
           

    }
    public static void main(String[] args){
        choice();
    }
}
