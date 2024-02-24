import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int checkNum = nums[0];
        int index = 1;
        int doubleCounter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == checkNum && doubleCounter < 2) {
                nums[index++] = nums[i];
                doubleCounter++;
            } else if (nums[i] != checkNum) {
                nums[index++] = nums[i];
                doubleCounter = 1;
                checkNum = nums[i];
            }
        }
        return index;
    }
}