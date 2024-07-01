import java.util.Arrays;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]= new int[] {-1,-1};
        int n = nums.length;
        int frst =0;
        int last = n-1;
        if (n == 0) {
            return result;
        }
        
    
        if (n == 1) {
            if (nums[0] == target) {
                result[0] = 0;
                result[1] = 0;
            }
            return result;
        }
        
        while (frst <= last) {
            int mid = frst + (last - frst) / 2;
            
            if (nums[mid] == target) {
                // Check left side for the starting index
               int start = mid;
                int end = mid;
                
             
                while (start > 0 && nums[start - 1] == target) {
                    start--;
                }
                
                // Find the end index
                while (end < n - 1 && nums[end + 1] == target) {
                    end++;
                }
                
                result[0] = start;
                result[1] = end;
                return result;
                
            } else if (nums[mid] < target) {
                frst = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        
        return result;
    }}
