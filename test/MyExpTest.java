import org.junit.jupiter.api.Test;

import java.util.Objects;


class MyExpTest {

    @Test
    void fizzBuzzTest() {
        MyExp myExp = new MyExp();

        String s45 = myExp.fizzBuzz(45);
        String s5 = myExp.fizzBuzz(5);
        String s3 = myExp.fizzBuzz(3);

        assert (Objects.equals(s45, "FizzBuzz"));
        assert (Objects.equals(s3, "Fizz"));
        assert (Objects.equals(s5, "Buzz"));
    }

}