class Solution {
    public int minimumCost(int[] nums) {
        int m = Integer.MAX_VALUE;
        for(int i = 1 ; i <nums.length; i++){
            for (int j= i+1; j<nums.length; j++){
                m = Math.min(m ,nums[0]+nums[j]+nums[i]);
            }
        }

       return m;
    }
}
