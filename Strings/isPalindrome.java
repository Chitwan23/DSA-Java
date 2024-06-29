class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c:clean.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String result = sb.toString();
        int n = result.length();
        if (n==0){
            return true;
        }
        int frst = 0;
        int last = n-1;
        while(frst<last){
            if (result.charAt(frst)==result.charAt(last)){
            last--;
            frst++;
            }
            else{
            return false;}
            
        }

        return true;
    }
}
