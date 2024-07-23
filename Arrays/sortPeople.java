class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       int j = heights.length;
        Map<Integer, String> mapping = new HashMap<>();
         for (int i = 0; i < j; ++i) {
            mapping.put(heights[i], names[i]);
        }
       Arrays.sort(heights);
       for (int i = 0; i < j / 2; ++i) {
            int temp = heights[i];
            heights[i] = heights[j - 1 - i];
            heights[j - 1 - i] = temp;
        }
          for (int i = 0; i < j; ++i) {
            names[i] = mapping.get(heights[i]);
        }
       
       
       return names; 
    }
}
