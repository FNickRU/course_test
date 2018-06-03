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
    protected final Point first;
    /**
     * Вторая вершина.
     */
    protected final Point second;
    /**
     * Третья вершина.
     */
    protected final Point third;

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
     * Метод проверки треугольника на существование.
     * @return true - если треугольник существует, false - иначе.
     */
    public boolean exists() {
        boolean isExist;

        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(first);

        isExist = (a + b > c) && (a + c > b) && (b + c > a);

        return isExist;
    }

    /**
     * Метод расчета площади треугольника.
     * @return площадь треугольника.
     * @throws IllegalStateException - если треугольник не существует.
     */
    public double area() {
        double result;

        if (!exists()) {
            throw new IllegalStateException();
        }

        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(first);
        double p = (a + b + c) / 2;

        result = sqrt(p * (p - a) * (p - b) * (p - c));

        return result;
    }
}
