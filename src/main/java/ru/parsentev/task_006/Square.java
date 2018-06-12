package ru.parsentev.task_006;

import ru.parsentev.task_002.Point;

/**
 * Класс квадрата в декартовой системе координат.
 *
 * @author fnickru
 * @since 12.06.2018
 */
public class Square {
    /**
     * Левая нижняя вершина.
     */
    private final Point first;
    /**
     * Левая верхняя вершина.
     */
    private final Point second;
    /**
     * Правая верхняя вершина.
     */
    private final Point third;
    /**
     * Правая нижняя вершина.
     */
    private final Point fourth;

    /**
     * Конструктор с параметрами.
     * @param first - первая вершина
     * @param second - вторая вершина
     * @param third - третья вершина
     * @param fourth - четвертая вершина
     */
    public Square(final Point first,
                  final Point second,
                  final Point third,
                  final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    /**
     * Метод проверки квадрата на существование.
     * @return true - если квадрат существует, false - иначе.
     */
    public boolean exists() {
        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(fourth);
        double d = fourth.distanceTo(first);
        double d1 = first.distanceTo(third);
        double d2 = second.distanceTo(fourth);
        return a == b && b == c && c == d && d1 == d2;
    }
}
