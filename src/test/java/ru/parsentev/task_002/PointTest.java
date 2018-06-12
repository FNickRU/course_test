package ru.parsentev.task_002;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тест класса точки.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class PointTest {
    /**
     * Расстояние между точками (0,0) и (0,1) равно 1.
     */
    @Test
    public void whenHasTwoPointThenReturnDistance() {
        final Point first = new Point(0, 0);
        final Point second = new Point(0, 1);
        double result = first.distanceTo(second);
        assertThat(result, closeTo(1d, 0.0005d));
    }
}
