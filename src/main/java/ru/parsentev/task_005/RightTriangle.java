package ru.parsentev.task_005;

import static java.lang.Math.floor;

import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

/**
 * Класс прямоугольного треугольника в декартовой системе координат.
 * @author fnickru
 * @since 11.06.2018
 */
public class RightTriangle extends Triangle {
    /**
     * Конструктор с параметрами.
     * @param first - первая вершина
     * @param second - вторая вершина
     * @param third - третья вершина
     */
    public RightTriangle(final Point first,
                         final Point second,
                         final Point third) {
        super(first, second, third);
    }

    /**
     * Метод проверки треугольника на существование.
     * @return true - если прямоугольный треугольник существует, false - иначе.
     */
    @Override
    public boolean exists() {
        Point[] points = super.getPoints();
        double a = points[0].distanceTo(points[1]);
        double b = points[1].distanceTo(points[2]);
        double c = points[2].distanceTo(points[0]);

        return floor(a * a) == floor(b * b + c * c)
               || floor(b * b) == floor(a * a + c * c)
               || floor(c * c) == floor(a * a + b * b);
    }
}
