package info.danos.greeter;

import info.danos.greeter.utils.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    protected void setUp(){
        calculator = new Calculator();
    }

    /**
     * Zero input test.
     */
    @DisplayName("Zero input test")
    @Test
    public void shouldReturnZero(){
        int result = calculator.add(0, 0);
        assertThat(result).isZero();
    }
}
