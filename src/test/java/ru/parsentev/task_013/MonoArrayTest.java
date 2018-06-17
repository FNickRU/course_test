package ru.parsentev.task_013;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест анализатора массива на однородность.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class MonoArrayTest {
    /**
     * Массив {1, 1, 1} однороден.
     */
    @Test
    public void mono() {
        MonoArray array = new MonoArray(new int[] {1, 1, 1});
        boolean result = array.exists();
        assertThat(result, is(true));
    }

    /**
     * Массив {0, 1, 1, 1, 0} не однороден.
     */
    @Test
    public void notMono() {
        MonoArray array = new MonoArray(new int[] {0, 1, 1, 1, 0});
        boolean result = array.exists();
        assertThat(result, is(false));
    }
}
