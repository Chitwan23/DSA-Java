class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int frst = 0;
        int last = n-1;
        if (target>=letters[last]){
            return letters[0];

        }
        
        while(frst<=last){
            
            int mid = frst+ (last-frst)/2;
        
            if (letters[mid]<=target){
                frst= mid+1;
            }
            else{
                last= mid-1;
            }

        }
        return letters[frst];

        
    }
}
