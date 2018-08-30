package ru.job4j.task_010;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест анализатора строки на корректность расстановки скобок.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class BracketsTest {
    /**
     * "()()()" - корректная строка.
     */
    @Test
    public void whenExpSequenceBracketsThenCorrect() {
        Brackets brackets = new Brackets("()()()");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    /**
     * "(" - некорректная строка.
     */
    @Test
    public void whenExpOnlyRigthBracketsThenInCorrect() {
        Brackets brackets = new Brackets("(");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }

    /**
     * "(())" - корректная строка.
     */
    @Test
    public void whenExpHasInnerBracketsThenCorrect() {
        Brackets brackets = new Brackets("(())");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    /**
     * "((" - некорректная строка.
     */
    @Test
    public void whenExpHasOnlyLeftBracketsThenIncorrect() {
        Brackets brackets = new Brackets("((");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }

    /**
     * "))" - некорректная строка.
     */
    @Test
    public void whenExpHasOnlyRightBracketsThenIncorrect() {
        Brackets brackets = new Brackets("))");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }

    /**
     * "()(()((())))" - корректная строка.
     */
    @Test
    public void whenExpComplexThenCorrect() {
        Brackets brackets = new Brackets("()(()((())))");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }
}
