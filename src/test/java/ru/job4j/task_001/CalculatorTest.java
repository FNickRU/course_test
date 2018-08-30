package ru.job4j.task_001;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест простого калькулятора.
 *
 * @author job4j
 * @since 19.07.2016
 */
public class CalculatorTest {
    /**
     * 1 + 1 = 2.
     */
    @Test
    public void whenAddOneOnOneThenResultTwo() {
        Calculator calc = new Calculator();
        calc.add(1d, 1d);
        assertThat(calc.getResult(), is(2d));
    }

    /**
     * 1 - 1 = 0.
     */
    @Test
    public void whenSubstractOneOnOneThenResultZero() {
        Calculator calc = new Calculator();
        calc.subtract(1d, 1d);
        assertThat(calc.getResult(), is(0d));
    }

    /**
     * 1 * 1 = 1.
     */
    @Test
    public void whenMultipleOneOnOneThenResultOne() {
        Calculator calc = new Calculator();
        calc.multiple(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    /**
     * 1 / 1 = 1.
     */
    @Test
    public void whenDivOneOnOneThenResultOne() {
        Calculator calc = new Calculator();
        calc.divide(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    /**
     * 0 / 0 = EXCEPTION.
     */
    @Test(expected = IllegalStateException.class)
    public void whenDivByZeroThenException() {
        Calculator calc = new Calculator();
        calc.divide(1d, 0d);
    }

    /**
     * 1 ^ 1 = 1.
     */
    @Test
    public void whenExpandOneOnOneThenResultOne() {
        Calculator calc = new Calculator();
        calc.expand(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    /**
     * 2 ^ 2 = 4.
     */
    @Test
    public void whenExpandTwoOnTwoThenResultFour() {
        Calculator calc = new Calculator();
        calc.expand(2d, 2d);
        assertThat(calc.getResult(), is(4d));
    }
}
