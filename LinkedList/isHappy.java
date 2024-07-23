class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast =  n;
        do{slow =findsquare(slow);
            fast =findsquare(findsquare(fast));}
        while(fast!=slow );
         if(slow==1 ){
                return true;
            }
        return false;

    }
     public int findsquare(int n){
            int ans =0;
            while (n>0){
                int rem = n %10;
                ans +=rem*rem;
                n/=10;

            }
            return ans;
        }
}
