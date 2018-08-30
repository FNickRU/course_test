package ru.job4j.task_016;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тесты анализатора двумерных массивов на наличие в них выигрышной
 * раскладки крестиков-ноликов.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class TicTacToeTest {
    /**
     * Размер поля игры в крестики-нолики.
     */
    public static final int FIELD_SIZE = 3;

    /**
     * [1, 0, 0]
     * [1, 1, 0]
     * [0, 0, 1]
     * Выигрышная последовательность - на главной диагонали.
     */
    @Test
    public void wheWinInDiagonalThenWinner() {
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
     * [1, 1, 0]
     * [0, 0, 0]
     * Выигрышная последовательность - на 3-й строке.
     */
    @Test
    public void wheWinInLastLineThenWinner() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 0, 1},
                        {1, 1, 0},
                        {0, 0, 0}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(true));
    }

    /**
     * [1, 0, 0]
     * [1, 0, 0]
     * [1, 0, 1]
     * Выигрышная последовательность - на 1-м и 2-м столбцах.
     */
    @Test
    public void whenWinInVertThenWinner() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 0, 0},
                        {1, 0, 0},
                        {1, 0, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(true));
    }

    /**
     * [1, 1, 1]
     * [0, 0, 0]
     * [0, 0, 1]
     * Выигрышная последовательность - на 1-й и 2-й строках.
     */
    @Test
    public void whenWinInHorThenWinner() {
        TicTacToe game = new TicTacToe(
                new int[][] {
                        {1, 1, 1},
                        {0, 0, 0},
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
    public void whenNotWinThenFalse() {
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

    /**
     * [0, 0, 1, 0]
     * [1, 1, 0, 1]
     * [0, 1, 1, 1]
     * [1, 0, 0, 0]
     * Выигрышная последовательность - на 3-й и 4-й строках.
     */
    @Test
    public void whenFieldNotNormalThenWinner() {

        TicTacToe game = new TicTacToe(
                new int[][] {
                        {0, 0, 1, 0},
                        {1, 1, 0, 1},
                        {0, 1, 1, 1},
                        {1, 0, 0, 0},
                },
                FIELD_SIZE
        );
        boolean result = game.hasWinner();
        assertThat(result, is(true));
    }
}
