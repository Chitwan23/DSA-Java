class Solution {
    public int subarraySum(int[] nums, int k) {
         int count = 0;
         for(int left = 0 ; left<nums.length; left++){
            int currsum = 0;       
        for (int right = left; right < nums.length; right++) {
             currsum += nums[right];
            
            if (currsum == k) {
                count++;
            }
        }
        
    }return count;
}}
