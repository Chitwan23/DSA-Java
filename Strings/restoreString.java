class Solution {
    public String restoreString(String s, int[] indices) {
        char result[]= new char[s.length()];
        for(int i= 0; i<indices.length; i++){
            // result[i]=s.charAt(indices[i]);
            result[indices[i]]=s.charAt(i);
        }
        return new String(result);
        
    }
}
