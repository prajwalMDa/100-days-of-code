public class Diagonalsum {
    public static int diagonalsum(int[][] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(i==j){
                    System.out.println("adding: "+nums[i][j]);
                    sum+=nums[i][j];
                }else if(i+j == nums.length-1){
                    System.out.println("adding: "+nums[i][j]);
                    sum+=nums[i][j];
                }
                
            }
        }

        return sum;
    }

    public static void main(String[] args){
        int[][] nums = {{1, 2, 3},
                        {1, 2, 3},
                        {1, 2, 3}};

        // System.out.println(diagonalsum(nums));
        int sum = diagonalsum(nums);
        System.out.println(sum);
    }
}
