package ru.job4j.task_004;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import ru.job4j.task_002.Point;

/**
 * Тест класса равнобедренного треугольника в декартовых координатах.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class IsoscelesTriangleTest {
    /**
     * Равнобедренный треугольник с вершинами (0,0), (0,2) и (2,0) существует.
     */
    @Test
    public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        boolean result = new IsoscelesTriangle(first, second, third).exists();
        assertThat(result, is(true));
    }

    /**
     * Треугольник с вершинами (0,0), (0,2) и (0,4) не существует.
     */
    @Test
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        boolean result = new IsoscelesTriangle(first, second, third).exists();
        assertThat(result, is(false));
    }

    /**
     * Треугольник с вершинами (0,0), (2,0) и (0,5) существует, но он не равнобедренный.
     */
    @Test
    public void notIsosceles() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        Point third = new Point(0, 5);
        boolean result = new IsoscelesTriangle(first, second, third).exists();
        assertThat(result, is(false));
    }
}
