package ru.job4j.task_015;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Класс, осуществляющий циклический сдвиг массива вправо.
 *
 * @author fnickru
 * @since 17.06.2018
 */
public final class CycleShift {
    /**
     * Входной массив.
     */
    private final int[] values;

    /**
     * Конструктор с параметром.
     * @param values - сдвигаемый массив
     */
    public CycleShift(final int[] values) {
        this.values = values;
    }

    /**
     * Метод для сдвига массива вправо на <b>position</b> элементов.
     * @param position - количество элементов для сдвига вправо
     * @return массив, со сдвинутыми значениями
     */
    public int[] shift(final int position) {
        int[] result = values.clone();

        ArrayUtils.reverse(result);
        ArrayUtils.reverse(result, position, values.length);
        ArrayUtils.reverse(result, 0, position);

        return result;
    }
}
