class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        int frst = 0;
        while (frst<n-2){
            int a = arr[frst];
            int b = arr[frst+1];
            int c = arr[frst+2];
            if (a%2!=0 && b%2!=0 && c%2!=0){
                return true;
            }
            frst++;
        }
       

        
        return false;
        
    }
}
