import java.util.HashMap;
import java.util.Map;

/**
 * You are given an integer array nums. You are initially positioned at the array's
 * first index, and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 */
class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        if (last == 0) return true;
        int maxMove = 0;
        int move;

        for (int i = 0; i < last; i++) {
            if (maxMove <= i && nums[i] == 0) return false;
            move = nums[i] + i;
            if (move >= last) return true;
            maxMove = Math.max(move, maxMove);
        }
        return false;
    }
}