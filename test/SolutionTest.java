
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class SolutionTest {
    Solution s = new Solution();

    @Test
    void testForArr1() {
        int[] arr = {3, 2, 1, 0, 4};
        boolean result = s.canJump(arr);

        assert !result;
    }
    @Test
    void testForArr2() {
        int[] arr = {0, 4, 1};
        boolean result = s.canJump(arr);

        assert !result;
    }
    @Test
    void testForArr3() {
        int[] arr = {2,3,1,1,4};
        boolean result = s.canJump(arr);

        assert result;
    }


}