
import org.junit.jupiter.api.Test;


class SolutionTest {
    Solution s = new Solution();

    @Test
    void majorityElement() {
        int[] arr = {7, 1, 5, 3, 6, 4};

        int res = s.maxProfit(arr);
        int expected = 7;
        System.out.println(res);

        assert (res == expected);
    }
}