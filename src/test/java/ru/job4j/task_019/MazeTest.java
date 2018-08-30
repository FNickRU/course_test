package ru.job4j.task_019;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;

import org.junit.Test;
import ru.parsentev.task_002.Point;
import java.util.List;

/**
 * Тесты для поиска кратчайшего пути в лабиринте.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class MazeTest {
    /**
     * [1, 0, 0]
     * [1, 1, 0]
     * [0, 0, 1]
     * Кратчайший путь - вершины [0, 0], [0, 1], [1, 1], [2, 1], [2, 2].
     */
    @Test
    public void singleSolution() {
        Maze maze = new Maze(
                new int[][] {
                        {1, 0, 0},
                        {1, 1, 1},
                        {0, 0, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(2, 2));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(0, 1),
                                new Point(1, 1),
                                new Point(2, 1),
                                new Point(2, 2)
                        )
                )
        );
    }

    /**
     * [1, 1, 1, 0, 1, 1, 1]
     * [1, 0, 1, 0, 1, 0, 1]
     * [1, 0, 1, 0, 1, 0, 1]
     * [1, 0, 1, 1, 1, 0, 1]
     * [1, 0, 0, 0, 0, 0, 1]
     * [1, 1, 1, 1, 1, 1, 1]
     * Кратчайший путь - вершины [0, 0], [0, 1], [0, 2], [0, 3], [0, 4],
     * [0, 5], [1, 5], [2, 5], [3, 5], [4, 5], [5, 5], [6, 5].
     */
    @Test
    public void multiSolutions() {
        Maze maze = new Maze(
                new int[][] {
                        {1, 1, 1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1, 0, 1},
                        {1, 0, 0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(6, 5));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(0, 1),
                                new Point(0, 2),
                                new Point(0, 3),
                                new Point(0, 4),
                                new Point(0, 5),
                                new Point(1, 5),
                                new Point(2, 5),
                                new Point(3, 5),
                                new Point(4, 5),
                                new Point(5, 5),
                                new Point(6, 5)
                        )
                )
        );
    }
}
