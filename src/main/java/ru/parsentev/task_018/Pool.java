package ru.parsentev.task_018;

/**
 * Класс для нахождения подмножества единиц максимального размера
 * в двумерном массиве.
 *
 * @author fnickru
 * @since 22.07.2018
 */
public final class Pool {
    /**
     * Значения двумерного массива.
     */
    private final int[][] values;

    /**
     * Конструктор с параметром.
     * @param values - значения двумерного массива
     */
    public Pool(final int[][] values) {
        this.values = values;
    }

    /**
     * Метод определения размера наибольшего множества единиц в заданном массиве.
     * @return размер максимального подмножества единиц
     */
    public int maxUnion() {
        int max = 0;

        for (int row = 0; row < values.length; ++row) {
            for (int col = 0; col < values[row].length; ++col) {
                int setSize = cleanSet(row, col);
                if (max < setSize) {
                    max = setSize;
                }
            }
        }

        return max;
    }

    /**
     * Метод для подсчета единиц в подмножестве и дальнейшей его очистки.
     * Очистка является занулением всего подмножества для пресечения бэктрекинга.
     * @param row - строка элемента, принадлежащего множеству
     * @param col - столбец элемента, принадлежащего множеству
     * @return количество зануленных единиц
     */
    private int cleanSet(final int row, final int col) {
        int subsetSize = 0;

        if (values[row][col] == 1) {
            values[row][col] = 0;

            subsetSize = 1;

            int height = values.length;
            int width = values[row].length;
            subsetSize += row > 0 ? cleanSet(row - 1, col) : 0;
            subsetSize += row < height - 1 ? cleanSet(row + 1, col) : 0;
            subsetSize += col > 0 ? cleanSet(row, col - 1) : 0;
            subsetSize += col < width - 1 ? cleanSet(row, col + 1) : 0;
        }

        return subsetSize;
    }
}
