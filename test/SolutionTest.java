
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void removeDuplicates() {
        int[] arr = {1,1,2};
        int expected = 2;
        int res;

        res = s.removeDuplicates(arr);

        Assertions.assertEquals(expected, res);
    }
    @Test
    void removeDuplicates2() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int expected = 5;
        int res;

        res = s.removeDuplicates(arr);

        Assertions.assertEquals(expected, res);
    }
}