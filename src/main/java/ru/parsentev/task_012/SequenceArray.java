package ru.parsentev.task_012;

/**
 * Класс проверки массива из нулей и единиц на то, что в нем есть последовательность из 3-х и больше единиц.
 *
 * @author fnickru
 * @since 16.06.2018
 */
public class SequenceArray {
    /**
     * Анализируемый массив.
     */
    private final int[] values;

    /**
     * Конструктор с параметром.
     * @param values - анализируемый массив из нулей и единиц.
     */
    public SequenceArray(final int[] values) {
        this.values = values;
    }

    /**
     * Метод проверки массива на наличие в нем последовательности из 3-х и больше единиц.
     * @return true - если такая последовательность в массиве есть, false - иначе.
     */
    public boolean containsOneSequence() {
        boolean hasSequence = false;

        for (int mid = 1; mid < values.length - 1; ++mid) {
            if (values[mid - 1] == 1
                    && values[mid] == 1
                    && values[mid + 1] == 1) {
                hasSequence = true;
                break;
            }
        }

        return hasSequence;
    }
}
