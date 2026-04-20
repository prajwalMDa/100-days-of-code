import java.util.Scanner;
public class TrappedRainWater{
    public static int traprainwater(int[] height){
        int[] Lmax = new int[height.length];
        int[] Rmax = new int[height.length];

        //left max
        for(int i=0; i<Lmax.length; i++){

            if(i==0){
                Lmax[i] = height[i];
            }else{
                int lmax = Math.max(Lmax[i-1],height[i]);
                Lmax[i] = lmax;
            } 

        }

        //right max
        for(int i=height.length-1; i>=0; i--){

            if(i==height.length-1){
                Rmax[i] = height[i];
            }else{
                int rmax = Math.max(Rmax[i+1],height[i]);
                Rmax[i] = rmax;
            }

        }

           
        //to calculate trapped water

        int trapped = 0;
        for(int i=0; i<height.length; i++){
            int waterlevel = Math.min(Lmax[i],Rmax[i])-height[i];
                trapped+=waterlevel;                       
        }

        return trapped;

    }

    //user unput array
    public static int[] realinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of bars : " );
        int[] height = new int[sc.nextInt()];
        for(int i=0; i<height.length; i++){
            System.out.print("Bar "+i+" height : ");
            height[i] = sc.nextInt();
        }
        return height;
    }
    public static void main(String[] args) {
     
        System.out.print("Trapped water : "+traprainwater(realinput()));
        
    }
}

