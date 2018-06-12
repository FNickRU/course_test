package ru.parsentev.task_004;

import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

/**
 * Класс равнобедренного треугольника в декартовой системе координат.
 *
 * @author fnickru
 * @since 08.06.2018
 */
public class IsoscelesTriangle extends Triangle {
    /**
     * Конструктор с параметрами.
     * @param first - первая вершина
     * @param second - вторая вершина
     * @param third - третья вершина
     */
    public IsoscelesTriangle(final Point first,
                             final Point second,
                             final Point third) {
        super(first, second, third);
    }

    /**
     * Метод проверки треугольника на существование.
     * @return true - если равнобедренный треугольник существует, false - иначе.
     */
    @Override
    public boolean exists() {
        Point[] points = super.getPoints();
        double a = points[0].distanceTo(points[1]);
        double b = points[1].distanceTo(points[2]);
        double c = points[2].distanceTo(points[0]);

        return super.exists() && ((a == b) || (a == c) || (b == c));
    }
}
