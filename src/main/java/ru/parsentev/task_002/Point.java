package ru.parsentev.task_002;

import static java.lang.Math.sqrt;

/**
 * Класс точки в декартовой системе координат.
 * @author fnickru
 * @since 03.06.2018
 */
public final class Point {
    /**
     * Координата по оси абцисс.
     */
    private final int x;
    /**
     * Координата по оси ординат.
     */
    private final int y;

    /**
     * Конструктор с параметрами.
     * @param x - координата по оси абцисс
     * @param y - координата по оси ординат
     */
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод расчета расстояния от данной точки до другой.
     * @param point - другая точка
     * @return расстояние между точками
     */
    public double distanceTo(final Point point) {
        double xDistance = point.x - x;
        double yDistance = point.y - y;

        return sqrt(xDistance * xDistance + yDistance * yDistance);
    }
}
