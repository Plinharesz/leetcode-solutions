package Questions.ContainsDuplicate;

import java.util.Arrays;

public class ContainsDuplicate_Sorting {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}






