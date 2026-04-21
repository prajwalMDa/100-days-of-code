class Solution1 {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int index;
            if(nums[i] == 0){
                result[i] = nums[i];
            }else if(nums[i]>0){
                index = (i + nums[i])%(nums.length);
                result[i] = nums[index];
            }else{
                index = ((i + nums[i]) % nums.length + nums.length) % nums.length;
                result[i] = nums[index];
            }
        }
        return result;
    }
}