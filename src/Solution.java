

class Solution {
    public int removeDuplicates(int[] nums) {
        int etalon = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != etalon) {
                nums[index++] = nums[i];
                etalon = nums[i];
            }
        }
        return index;
    }
}