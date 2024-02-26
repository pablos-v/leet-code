
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void majorityElement() {
        int[] arr = {3,2,3};
        int exp = 3;

        int res = s.majorityElement(arr);

        assert (exp==res);
    }
}