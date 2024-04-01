
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class SolutionTest {
    Solution s = new Solution();

    @Test
    void testForArr1() {
        int[] arr = {2, 3, 1, 1, 4};
        int result = s.jump(arr);
        System.out.println(result);
        assert result == 2;
    }

    @Test
    void testForArr2() {
        int[] arr = {1, 2};
        int result = s.jump(arr);
        System.out.println(result);
        assert result == 1;
    }
    @Test
    void testForArr3() {
        int[] arr = {1, 1, 1, 1};
        int result = s.jump(arr);
        System.out.println(result);
        assert result == 3;
    }

}