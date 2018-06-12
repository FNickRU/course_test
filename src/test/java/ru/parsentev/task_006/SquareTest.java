package ru.parsentev.task_006;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import ru.parsentev.task_002.Point;

/**
 * Тест класса квадрата в декартовой системе координат.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SquareTest {
    /**
     * Квадрат с вершинами (0,0), (0,2), (2,2) и (2,0) существует.
     */
    @Test
    public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 2);
        Point fourth = new Point(2, 0);
        boolean result = new Square(first, second, third, fourth).exists();
        assertThat(result, is(true));
    }

    /**
     * Квадрат с вершинами (0,0), (0,2), (0,4) и (0,6) не существует.
     */
    @Test
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        Point fourth = new Point(0, 6);
        boolean result = new Square(first, second, third, fourth).exists();
        assertThat(result, is(false));
    }

    /**
     * Квадрат с вершинами (0,0), (1,2), (1,4) и (0,6) не существует.
     */
    @Test
    public void notSquare() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 2);
        Point third = new Point(1, 4);
        Point fourth = new Point(0, 6);
        boolean result = new Square(first, second, third, fourth).exists();
        assertThat(result, is(false));
    }
}
