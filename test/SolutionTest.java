
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class SolutionTest {
    Solution s = new Solution();

    @Test
    void testMethod() {
        int[] inputArray = {3,0,6,1,5};
        int response = s.hIndex(inputArray);
        int expected = 3;
        System.out.println(response);
        assert response == expected;

    }

}