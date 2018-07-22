package ru.parsentev.task_018;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест класса для нахождения максимального подмножества единиц.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class PoolTest {
    /**
     * [1, 0, 0]
     * [1, 1, 0]
     * [0, 0, 1]
     * Наибольшее подмножество - элементы [0,0], [1, 0], [1, 1].
     */
    @Test
    public void multi() {
        Pool pool = new Pool(
                new int[][] {
                        {1, 0, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }
        );
        int result = pool.maxUnion();
        assertThat(result, is(3));
    }

    /**
     * [1, 1, 1]
     * [1, 1, 1]
     * [1, 1, 1]
     * Наибольшее подмножество - весь массив.
     */
    @Test
    public void one() {
        Pool pool = new Pool(
                new int[][] {
                        {1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                }
        );
        int result = pool.maxUnion();
        assertThat(result, is(9));
    }
}
