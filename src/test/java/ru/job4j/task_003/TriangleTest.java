package ru.job4j.task_003;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import ru.job4j.task_002.Point;

/**
 * Тест класса треугольника в декартовых координатах.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class TriangleTest {
    /**
     * Площадь треугольника с вершинами (0,0), (0,2) и (2,0) равна 2.
     */
    @Test
    public void calculateArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        double result = new Triangle(first, second, third).area();
        assertThat(result, closeTo(2d, 0.0005d));
    }

    /**
     * Треугольник с вершинами (0,0), (0,2) и (2,0) существует.
     */
    @Test
    public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        boolean result = new Triangle(first, second, third).exists();
        assertThat(result, is(true));
    }

    /**
     * Треугольник с вершинами (0,0), (0,2) и (0,4) не существует.
     */
    @Test
    public void notExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        boolean result = new Triangle(first, second, third).exists();
        assertThat(result, is(false));
    }

    /**
     * Треугольник с вершинами (0,0), (0,2) и (0,4) не существует.
     * Попытка вычисления площади вызывает ошибку
     */
    @Test(expected = IllegalStateException.class)
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        new Triangle(first, second, third).area();
    }

    /**
     * Треугольник с вершинами (0,0), (0,0) и (0,0) не существует.
     * Попытка вычисления площади вызывает ошибку
     */
    @Test(expected = IllegalStateException.class)
    public void inPoint() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Point third = new Point(0, 0);
        new Triangle(first, second, third).area();
    }

}
