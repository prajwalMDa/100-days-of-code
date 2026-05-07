public class SprialMatrix{
    public static void sprial(int[][] nums){
        int SR = 0;
        int ER = nums.length-1;
        int SC = 0; 
        int EC = nums[0].length-1;

        while(SR<=ER && SC<=EC){
            //top
            for(int i=SC; i<=EC; i++){
                System.out.print(nums[SR][i]+"  ");
            }

            //right
            for(int i=SR+1; i<=ER; i++){
                System.out.print(nums[i][EC]+"  ");
            }

            //bottom
            if(SR<ER){
                for(int i=EC-1; i>=SC; i--){
                System.out.print(nums[ER][i]+"  ");
                }
            }
            
            //left
            if(SC<EC){
                for(int i=ER-1; i>=SR+1; i--){
                    System.out.print(nums[i][SC]+"  ");
                }
            }
            SR++;
            SC++;
            ER--;
            EC--;
        }
    }
    public static void main(String[] args){
        int[][] array = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        sprial(array);
    }
}