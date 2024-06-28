
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
         List<Integer> interList = new ArrayList<>();
        int i = 0;
        int j =0;

        while( i<nums1.length && j<nums2.length){
            if (nums1[i]<nums2[j]){
                i++;
            }
            else if (nums2[j]<nums1[i]){
                j++;
            }
            else{
                interList.add(nums2[j]);
                i++;
                j++;


            }

        }
        int[] inter = new int[interList.size()];
        for (int k = 0; k < interList.size(); k++) {
            inter[k] = interList.get(k);
           

            
        } return inter;

        }
}
        
    
