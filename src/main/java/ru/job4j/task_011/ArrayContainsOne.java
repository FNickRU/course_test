package ru.job4j.task_011;

import java.util.Arrays;

/**
 * Класс проверки массива из нулей и единиц на то, что в нем нет нулей.
 * При наличии в массиве иных значений поведение не определено.
 *
 * @author fnickru
 * @since 16.06.2018
 */
public final class ArrayContainsOne {
    /**
     * Анализируемый массив.
     */
    private final int[] values;

    /**
     * Конструктор с параметром.
     * @param values - анализируемый массив из нулей и единиц.
     */
    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    /**
     * Метод проверки массива на однородность.
     * @return true - если массив сотоит только из единиц, false - иначе.
     */
    public boolean containsOnlyOne() {
        int min = Arrays.stream(values).reduce(Integer.MAX_VALUE, Integer::min);
        return min == 1;
    }
}
