
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void removeDuplicates() {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int expected = 5;
        int res;
        int[] expArr = {1, 1, 2, 2, 3};

        res = s.removeDuplicates(arr);

        Assertions.assertEquals(expected, res);
        for (int i = 0; i < expected; i++) {
            Assertions.assertEquals(expArr[i], arr[i]);

        }
    }

    @Test
    void removeDuplicates2() {
        int[] arr = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expected = 7;
        int res;
        int[] expArr = {0, 0, 1, 1, 2, 3, 3};

        res = s.removeDuplicates(arr);

        Assertions.assertEquals(expected, res);
        for (int i = 0; i < expected; i++) {
            Assertions.assertEquals(expArr[i], arr[i]);

        }
    }
}