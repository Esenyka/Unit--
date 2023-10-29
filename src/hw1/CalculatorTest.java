package hw1;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        assertThat(Calculator.calculateDiscount(100, 20)).isEqualTo(80);

        assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 20)).
                isInstanceOf(ArithmeticException.class);

    }
}
