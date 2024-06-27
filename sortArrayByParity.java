class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int [] sort = new int[n];
        int start = 0;
        int last = 1;
        for (int i =0; i<n ; i++){
            if(nums[i]%2==0){
                sort[start]= nums[i];
                start +=2;
            }
            else{sort[last]= nums[i];
            last +=2;

            }
        }return sort;
        
    }
}
