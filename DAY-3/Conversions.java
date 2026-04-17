import java.util.Scanner;

public class Conversions {

    public static int BinToDec(int Bin){
        int Decimal = 0;
        int pow = 0;
        while(Bin>0){
            int dig = Bin%10;
            Decimal += dig*(int)Math.pow(2, pow);
            Bin/=10;
            pow++;
        }
        return Decimal;
    }

    public static int DectoBin(int Dec){
        int Binary = 0;
        int pow = 0;
        while(Dec>0){
            int dig = Dec%2;
            Binary += dig*(int)Math.pow(10,pow);
            Dec/=2;
            pow++;
        }
        return Binary;
    }

    //choosing function
    public static void Choose(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1 -> Bin to Dec");
            System.out.println("2 -> Dec to Bin");
            System.out.println("3 -> Exit");
            System.out.print("enter yr choice:");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.println(BinToDec(sc.nextInt()));
            }else if(choice == 2){
                System.out.println(DectoBin(sc.nextInt()));
            }else if(choice == 3){
                System.out.println("exiting..\n");
            }else{
                System.out.println("Invalid input..\n");
            }

        }while(choice!=3);

        sc.close();
    }

    public static void main(String[] args){
        Choose();
    }
}
