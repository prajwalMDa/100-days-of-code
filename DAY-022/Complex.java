import java.util.Scanner;
public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complexx c = new Complexx();
        System.out.println("Enter real and imaginary part of complex number 1");
        c.Set_real1_N_img1(sc.nextFloat(),sc.nextFloat());
        System.out.println("Enter real and imaginary part of complex number 2");
        c.Set_real2_N_img2(sc.nextFloat(), sc.nextFloat());

        c.addition();
        c.sutraction();
        c.multiplication();
    }
}

class Complexx{
    private float a;
    private float x;
    private float b;
    private float y;   

    void Set_real1_N_img1 (float real,float img){
        this.a = real;
        this.x = img;
    }

    void Set_real2_N_img2 (float real,float img){
        this.b = real;
        this.y = img;
    }
    

    void addition(){
        System.out.print("addition: ");

        System.out.println((x+y)>=0
        ? (a+b)+" + "+Math.abs((x+y))+"i"
        : (a+b)+" - "+Math.abs((x+y))+"i");

    } 

    void sutraction(){
        System.out.print("subtraction: ");
        System.out.println((x-y)>=0
        ? ((a-b)+" + "+Math.abs((x-y))+"i") 
        : ((a-b)+" - "+Math.abs((x-y))+"i"));
    }

    void multiplication(){
        System.out.print("multiplication: ");
        System.out.println((a*y + b*x)>=0
        ? (a*b - x*y)+" + "+(a*y + b*x)+"i"
        : (a*b - x*y)+" - "+Math.abs((a*y + b*x))+"i");
    }

}