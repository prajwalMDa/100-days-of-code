public class RepNum {
    public static int repeatednumbers(int[][] nums , int target){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(nums[i][j] == target){
                    count++;
                }
            }
        }
        return count;
    }

        public static void main(String[] args){
        int[][] nums = {{4,7,8},
                        {8,8,7}};

        int count = repeatednumbers(nums, 7);
        System.out.println(count);

    }
}
