package ru.parsentev.task_011;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест анализатора массива на однородность состава.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ArrayContainsOneTest {
    /**
     * Массив {1} состоит только из единиц.
     */
    @Test
    public void onlyOne() {
        ArrayContainsOne array = new ArrayContainsOne(new int[] {1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(true));
    }

    /**
     * Массив {1, 1, 0} состоит не только из единиц.
     */
    @Test
    public void notOnlyOne() {
        ArrayContainsOne array = new ArrayContainsOne(new int[] {1, 1, 0});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(false));
    }
}
