package ru.job4j.task_015;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест циклического сдвига массива на N элементов вправо.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class CycleShiftTest {
    /**
     * [1, 2, 3, 4, 5] - shift(2) - [4, 5, 1, 2, 3].
     */
    @Test
    public void multi() {
        CycleShift cycle = new CycleShift(new int[] {1, 2, 3, 4, 5});
        int[] result = cycle.shift(2);
        assertThat(result, is(new int[] {4, 5, 1, 2, 3}));
    }

    /**
     * [1] - shift(2) - [1].
     */
    @Test
    public void one() {
        CycleShift cycle = new CycleShift(new int[] {1});
        int[] result = cycle.shift(2);
        assertThat(result, is(new int[] {1}));
    }
}
