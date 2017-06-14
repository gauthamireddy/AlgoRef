public class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
 
        int last = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i --) {
            if(nums[i] + i >= last) {
                last = i;
            }
        }
 
        return last == 0;
    }
}
  
