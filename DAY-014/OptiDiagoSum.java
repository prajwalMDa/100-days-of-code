public class OptiDiagoSum {
    public static int diagonalsum(int[][] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            
            //primary diagonal
            sum+=nums[i][i];

            //secondary diagonal
            if(i != nums.length-1-i){
                sum+=nums[i][nums.length-1-i];
            }
            
        }
        return sum;
    }

        public static void main(String[] args){
        int[][] nums = {{3, 2, 1},
                        {1, 2, 3},
                        {1, 2, 3}};
        
                        //sorting 2d array
        // for (int i = 0; i < nums.length; i++) {
        //     Arrays.sort(nums[i]);
        // }

        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums[i].length; j++){
        //         System.out.print(nums[i][j]+" ");
        //     }
        //    System.out.println();
        // }

        // System.out.println(diagonalsum(nums));
        int sum = diagonalsum(nums);
        System.out.println(sum);
    }
}
