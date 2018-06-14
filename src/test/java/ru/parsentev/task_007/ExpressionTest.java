package ru.parsentev.task_007;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест парсера математических выражений.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ExpressionTest {
    /**
     * 2 + 2 = 4.
     */
    @Test
    public void calc() {
        Expression expr = new Expression("2+2");
        double result = expr.calc();
        assertThat(result, is(4d));
    }

    /**
     * 2 + = EXCEPTION.
     */
    @Test(expected = IllegalStateException.class)
    public void noValid() {
        new Expression("2+").calc();
    }
}
