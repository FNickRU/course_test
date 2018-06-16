package ru.parsentev.task_011;

import java.util.Arrays;

/**
 * Класс проверки массива из нулей и единиц на то, что в нем нет нулей.
 * При наличии в массиве иных значений поведение не определено.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ArrayContainsOne {
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
        return Arrays.stream(values).reduce(2, Integer::min) == 1;
    }
}
