package ru.parsentev.task_003;

import static java.lang.Math.sqrt;

import ru.parsentev.task_002.Point;

/**
 * Класс треугольника в декартовой системе координат.
 * @author fnickru
 * @since 03.06.2018
 */
public class Triangle {
    /**
     * Первая вершина.
     */
    private final Point first;
    /**
     * Вторая вершина.
     */
    private final Point second;
    /**
     * Третья вершина.
     */
    private final Point third;

    /**
     * Конструктор с параметрами.
     * @param first - первая вершина
     * @param second - вторая вершина
     * @param third - третья вершина
     */
    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Метод доступа к вершинам треугольника.
     * @return массив из 3 объектов класса Point - вершин треугольника
     */
    public Point[] getPoints() {
        return new Point[]{first, second, third};
    }

    /**
     * Метод проверки треугольника на существование.
     * @return true - если треугольник существует, false - иначе.
     */
    public boolean exists() {
        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(first);

        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /**
     * Метод расчета площади треугольника.
     * @return площадь треугольника.
     * @throws IllegalStateException - если треугольник не существует.
     */
    public double area() {
        if (!exists()) {
            throw new IllegalStateException();
        }

        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(first);
        double p = (a + b + c) / 2;

        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
