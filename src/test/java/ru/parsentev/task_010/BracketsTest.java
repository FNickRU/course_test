package ru.parsentev.task_010;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест анализатора строки на корректность расстановки скобок.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class BracketsTest {
    /**
     * "()()()" - корректная строка.
     */
    @Test
    public void valid() {
        Brackets brackets = new Brackets("()()()");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    /**
     * "(" - некорректная строка.
     */
    @Test
    public void inValid() {
        Brackets brackets = new Brackets("(");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }
}
