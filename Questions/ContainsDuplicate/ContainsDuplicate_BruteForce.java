package Questions.ContainsDuplicate;

public class ContainsDuplicate_BruteForce {
    // 1. BRUTE FORCE
    public boolean hasDuplicate(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j<nums.length; i++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}



Arrays.
