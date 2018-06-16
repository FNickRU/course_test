package ru.parsentev.task_012;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест анализатора массива на наличие в нем последовательности из 3-х единиц.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArrayTest {
    /**
     * Массив {0, 1, 1, 1, 0} содержит последовательность из 3-х единиц.
     */
    @Test
    public void contains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 1, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(true));
    }

    /**
     * Массив {0, 1, 0, 1, 0} не содержит последовательность из 3-х единиц.
     */
    @Test
    public void notContains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 0, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(false));
    }
}
