class Solution {
    public int[] numberGame(int[] nums) {
         Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            int val =nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=val;
        }
        return nums;
    }
}
