import java.util.Arrays;

/**
 * Created by ggaddam on 8/21/2016.
 */
public class MissingNumber {
        public int missingNumber(int[] nums) {
            if(nums == null || nums.length == 0) return 0;

            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i ++) {
                if(nums[i] != i) return i;
            }

            return nums.length;
        }

}
