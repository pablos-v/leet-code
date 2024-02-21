package test;

import org.junit.jupiter.api.Test;
import src.Solution;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void merge() {
        int[] n1 = {1, 2, 3, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        s.merge(n1, m, n2, n);

        assertEquals(Arrays.toString(new int[]{1, 2, 2, 3, 5, 6}),Arrays.toString(n1));
    }
}