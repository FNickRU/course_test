package ru.parsentev.task_003;

import ru.parsentev.task_002.Point;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        throw new UnsupportedOperationException();
    }

    public double area() {
        throw new UnsupportedOperationException();
    }
}
