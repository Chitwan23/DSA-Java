class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int frst = 0;
        int last = n-1;
        while(frst<=last){
           
        }
        if(nums[frst]<= nums[mid]){
        if(nums[frst]<=target && target<nums[mid]){
            last = mid-1;
        }
        else{
            frst = mid+1;
        }
        }
        else{
            if(nums[mid]< target &&  target <=nums[last]){
                frst= mid +1;
            }
            else{
                last = mid-1;
            }
        }
        }
        return -1; 
        
    }
}
