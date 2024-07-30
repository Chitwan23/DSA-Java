class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double av = (nums[0]+nums[nums.length-1]) /2.0;
        int i = 1;
        int j = (nums.length-2);
        while(i<=j){
            double minav = (nums[i]+nums[j]) /2.0;
            if (av>minav){
                av=minav;
            }
            i++;
            j--;

        }
       return av;
        
    }
}
