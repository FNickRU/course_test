package ru.parsentev.task_019;

import ru.parsentev.task_002.Point;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для нахождения кратчайшего пути в лабиринте.
 *
 * @author fnickru
 * @since 22.07.2018
 */
public final class Maze {
    /**
     * Описание лабиринта: 1 - пустое пространство, 0 - стена.
     */
    private final int[][] values;

    /**
     * Конструктор с параметром.
     * @param values - описание лабиринта
     */
    public Maze(final int[][] values) {
        this.values = values;
    }

    /**
     * Метод нахождения кратчайшего пути в лабиринте.
     * Использован алгоритм поиска в ширину.
     * @param start - точка начала движения
     * @param finish - точка, которую необходимо достичь
     * @return путь от начальной точки до конечной
     */
    public List<Point> solution(final Point start, final Point finish) {
        int startX = start.getX();
        int startY = start.getY();

        if (values[startY][startX] == 0) {
            throw new IllegalArgumentException("start is unreachable");
        }

        LinkedList<Point> queue = new LinkedList<>();
        int[][] dist = new int[values.length][values[0].length];

        for (int[] row: dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        dist[startY][startX] = 0;
        queue.add(start);

        int[] horDir = {-1, 0, 0, 1};
        int[] verDir = {0, -1, 1, 0};

        while (!queue.isEmpty()) {
            Point cur = queue.removeLast();

            int curX = cur.getX();
            int curY = cur.getY();

            for (int idx = 0; idx < horDir.length; ++idx) {
                int x = curX + horDir[idx];
                int y = curY + verDir[idx];

                boolean inHorRange = 0 <= x && x < values[0].length;
                boolean inVerRange = 0 <= y && y < values.length;
                boolean inRange = inHorRange && inVerRange;

                if (inRange) {
                    boolean isEmpty = values[y][x] == 1;
                    boolean isShortcut = dist[curY][curX] + 1 < dist[y][x];
                    if (isEmpty && isShortcut) {
                        dist[y][x] = dist[curY][curX] + 1;

                        Point node = new Point(x, y);

                        /**
                         * Поднимаем вершину в очереди, если она уже в ней.
                         * Иначе - просто добавляем.
                         */
                        queue.remove(node);
                        queue.add(node);
                    }
                }
            }
        }

        int finishX = finish.getX();
        int finishY = finish.getY();

        if (dist[finishY][finishX] == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("finish is unreachable");
        }

        LinkedList<Point> path = new LinkedList<>();
        path.add(finish);

        while (path.size() != dist[finishY][finishX] + 1) {
            Point cur = path.getFirst();

            int curX = cur.getX();
            int curY = cur.getY();

            for (int idx = 0; idx < horDir.length; ++idx) {
                int x = curX + horDir[idx];
                int y = curY + verDir[idx];

                boolean inHorRange = 0 <= x && x < values[0].length;
                boolean inVerRange = 0 <= y && y < values.length;
                boolean inRange = inHorRange && inVerRange;

                if (inRange && dist[y][x] == dist[curY][curX] - 1) {
                    path.addFirst(new Point(x, y));
                    break;
                }
            }
        }

        return path;
    }
}
