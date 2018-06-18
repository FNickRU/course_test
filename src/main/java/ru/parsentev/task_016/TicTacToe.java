package ru.parsentev.task_016;

import ru.parsentev.task_013.MonoArray;

/**
 * Класс проверки поля для игры в крестики-нолики на наличие в нем выигрышной позиции.
 *
 * @author fnickru
 * @since 18.06.2018
 */
public class TicTacToe {

    /**
     * Направление последовательности знаков:
     * в строку, в столбик или по одной из диагоналей.
     */
    private enum Direction {
        /**
         * Направление: в строку.
         */
        HOR,
        /**
         * Направление: в столбец.
         */
        VER,
        /**
         * Направление: по главной диагонали.
         */
        MAJ_DIAG,
        /**
         * Направление: по побочной диагонали.
         */
        MIN_DIAG
    }

    /**
     * Размер поля для игры в крестики-нолики (может отличаться от размера массива).
     */
    private final int fieldSize;

    /**
     * Анализируемый двумерный массив.
     */
    private final int[][] values;

    /**
     * Конструктор с одним параметром (поле размером с массив).
     * @param values - анализируемый двумерный массив.
     */
    public TicTacToe(final int[][] values) {
        this(values, values.length);
    }

    /**
     * Конструктор с двумя параметрами.
     * @param values - анализируемый двумерный массив.
     * @param size - размер игрового поля.
     */
    public TicTacToe(final int[][] values, final int size) {
        this.values = values;
        fieldSize = size;
    }

    /**
     * Метод для проверки, есть ли в двумерном массиве выигрышная комбинация.
     * @return true - если комбинация есть, false - иначе.
     */
    public boolean hasWinner() {
        boolean hasWinner = false;
        all:
        for (int y = 0; y < values.length; ++y) {
            for (int x = 0; x < values.length; ++x) {
                boolean inHRange = values.length - x >= fieldSize;
                boolean inVRange = values.length - y >= fieldSize;
                boolean inRange = inHRange && inVRange;
                if (inHRange && isSequenceWins(x, y, Direction.HOR)
                    || inVRange && isSequenceWins(x, y, Direction.VER)
                    || inRange && isSequenceWins(x, y, Direction.MAJ_DIAG)
                    || inRange && isSequenceWins(x, y, Direction.MIN_DIAG)) {
                    hasWinner = true;
                    break all;
                }
            }
        }

        return hasWinner;
    }

    /**
     * Проверка, является ли данная последовательность выигрышной.
     * @param x - столбец, с которого начинается последовательность.
     * @param y - строка, с которой начинается последовательность.
     * @param direction - направление последовательности.
     * @return true - если анализируемая последовательность - выигрышная, true - иначе.
     */
    private boolean isSequenceWins(final int x,
                                   final int y,
                                   final Direction direction) {
        int[] sequence = new int[fieldSize];

        switch (direction) {
            case VER:
                for (int idx = 0; idx < fieldSize; ++idx) {
                    sequence[idx] = values[y + idx][x];
                }
                break;
            case HOR:
                for (int idx = 0; idx < fieldSize; ++idx) {
                    sequence[idx] = values[y][x + idx];
                }
                break;
            case MAJ_DIAG:
                for (int idx = 0; idx < fieldSize; ++idx) {
                    sequence[idx] = values[y + idx][x + idx];
                }
                break;
            case MIN_DIAG:
                for (int idx = 0; idx < fieldSize; ++idx) {
                    sequence[idx] = values[y + idx][x + (fieldSize - 1) - idx];
                }
                break;
            default:
                throw new IllegalArgumentException();
        }

        return new MonoArray(sequence).exists();
    }
}
