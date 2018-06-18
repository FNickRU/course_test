package ru.parsentev.task_016;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тесты анализатора двумерных массивов на наличие в них выигрышной раскладки крестиков-ноликов.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class TicTacToeTest {
    /**
     * [1, 0, 0]
     * [1, 1, 0]
     * [0, 0, 1]
     * Выигрышная последовательность - на главной диагонали.
     */
    @Test
    public void hasWinner() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 0, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(true));
    }

    /**
     * [1, 0, 1]
     * [1, 0, 0]
     * [0, 1, 1]
     * Выигрышной последовательности нет.
     */
    @Test
    public void hasNotWinner() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 0, 1},
                        {1, 0, 0},
                        {0, 1, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(false));
    }
}
