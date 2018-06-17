package ru.parsentev.task_013;

import java.util.Arrays;

/**
 * Класс проверки числового массива на однородность.
 *
 * @author fnickru
 * @since 17.06.2018
 */
public class MonoArray {
    /**
     * Анализируемый массив.
     */
    private final int[] values;

    /**
     * Конструктор с параметром.
     * @param values - анализируемый массив из нулей и единиц.
     */
    public MonoArray(final int[] values) {
        this.values = values;
    }

    /**
     * Метод проверки массива на однородность.
     * @return true - если все элемента массива одинаковые, false - иначе.
     */
    public boolean exists() {
        int min = Arrays.stream(values).reduce(Integer.MAX_VALUE, Integer::min);
        int max = Arrays.stream(values).reduce(Integer.MIN_VALUE, Integer::max);
        return min == max;
    }
}
