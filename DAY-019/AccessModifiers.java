import java.util.Scanner;
public class AccessModifiers {
    public static void main(String[] args){
        Bank canara = new Bank();
        System.out.println("username: "+canara.username);
        // canara.changepassward("131313");
        // System.out.println(canara.passward);
        canara.varification();
    }
    
}

class Bank{
    Scanner sc = new Scanner(System.in);

    String username = "prajwal";
    private String passward = "1234";

    public void varification(){

        System.out.print("enter current passward: ");
        String oldpassward = sc.next();

        if(oldpassward.equals(passward)){

            System.out.println(" -------------------------------");
            System.out.println("|            VARIFIED           |");
            System.out.println(" -------------------------------");

            String trial1;
            String trial2;
            int choice = 0;
            do { 
                System.out.print("Enter new passward: ");
                trial1 = sc.next();
            
                System.out.print("Conform passward: ");
                trial2 = sc.next();

                if(trial1.equals(trial2)){
                    changepassward(trial1);
                    System.out.println("----------------------------------------------");
                    System.out.println("| Your passward has been successfully changed |");
                    System.out.println("----------------------------------------------");
                } else {
                    System.out.println("----------------------------------");
                    System.out.println("| Passward doesnt match try again |");
                    System.out.println("----------------------------------");
                    do { 
                        System.out.println("Press 1 to try again");
                        System.out.println("Press 0 to exit");
                        System.out.print("--> ");
                        choice = sc.nextInt();
                    } while (choice != 0 && choice != 1);
                    
                }
            } while ( !(trial1.equals(trial2)) && (choice != 0));

        } else {
            System.out.println("------------------------------------");
            System.out.println("             NOT VARIFIED           ");
            System.out.println("------------------------------------");
        }

        sc.close();
    }

    private void changepassward(String newpassward){
        passward = newpassward;
    }


}
