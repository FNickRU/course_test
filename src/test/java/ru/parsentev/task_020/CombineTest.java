package ru.parsentev.task_020;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;

import org.junit.Test;
import java.util.List;

/**
 * Тесты класса для нахождения вснх перестановок массива.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CombineTest {
    /**
     * Для массива (1, 2) существует 2 перестановки:
     * (1, 2) и (2, 1).
     */
    @Test
    public void simple() {
        Combine combine = new Combine(new int[] {1, 2});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                        asList(
                                asList(1, 2),
                                asList(2, 1)
                        )
                )
        );
    }

    /**
     * Для массива (1, 2, 3) существует 6 перестановок:
     * (1,2,3), (1,3,2), (2,1,3), (2,3,1), (3,1,2) и (3,2,1).
     */
    @Test
    public void three() {
        Combine combine = new Combine(new int[] {1, 2, 3});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                        asList(
                                asList(1, 2, 3),
                                asList(1, 3, 2),
                                asList(2, 1, 3),
                                asList(2, 3, 1),
                                asList(3, 1, 2),
                                asList(3, 2, 1)
                        )
                )
        );
    }
}
