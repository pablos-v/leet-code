/**
 * Создайте программу, которая выводит числа от 1 до n.
 * <p>
 * - Если число делится на 3, выведите 'Fizz';
 * - если число делится на 5, выведите 'Buzz';
 * - если число делится и на 3 и на 5, выведите 'FizzBuzz'.
 */
public class MyExp {

    private int FIZZ_VAR = 3;
    private int BUZZ_VAR = 5;


    public String fizzBuzz(int i) {
        return fizz(i) + buzz(i);
    }

    private String fizz(int i) {
        return isFizz(i) ? "Fizz" : "";
    }

    private String buzz(int i) {
        return isBuzz(i) ? "Buzz" : "";
    }

    private boolean isFizz(int i) {
        return i % FIZZ_VAR == 0;
    }

    private boolean isBuzz(int i) {
        return i % BUZZ_VAR == 0;
    }

}
