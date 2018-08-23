package ru.parsentev.task_002;

import java.util.Objects;

import static java.lang.Math.sqrt;

/**
 * Класс точки в декартовой системе координат.
 *
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
     * Метод получения координаты точки по оси абцисс.
     * @return x - координату по оси абцисс
     */
    public int getX() {
        return x;
    }

    /**
     * Метод получения координаты точки по оси ординат.
     * @return y - координату по оси ординат
     */
    public int getY() {
        return y;
    }

    /**
     * Метод проверки равенства двух точек.
     * Точки равны, если координаты равны.
     * @param o - объект, с которым сравнивается точка
     * @return true - если объекты (точки) равны, false - иначе.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    /**
     * Метод получения хэша точки.
     * @return хэш объекта точки
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
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
