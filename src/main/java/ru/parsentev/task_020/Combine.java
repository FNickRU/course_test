package ru.parsentev.task_020;

import org.apache.commons.lang3.ObjectUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс для поиска всех перестановок массива.
 *
 * @author fnickru
 * @since 26.08.2018
 */
public final class Combine {
    /**
     * Значения массива, перестановки которого необходимо найти.
     */
    private final int[] values;

    /**
     * Конструктор с параметром.
     * @param values - входной массив
     */
    public Combine(final int[] values) {
        this.values = values;
    }

    /**
     * Метод поиска всех перестановок массива обычным перебором.
     * @return список из перестановок массива, представленных в виде списков
     */
    public List<List<Integer>> generate() {
        List<List<Integer>> permutations = new LinkedList<>();

        permutations.add(new LinkedList<>());

        for (int value : values) {
            List<List<Integer>> newSubLists = new LinkedList<>();

            for (List<Integer> subList : permutations) {
                for (int idx = 0; idx <= subList.size(); ++idx) {
                    LinkedList<Integer> newSubList = new LinkedList<>(subList);
                    newSubList.add(idx, value);

                    newSubLists.add(newSubList);
                }
            }

            permutations = new LinkedList<>(newSubLists);
        }

        permutations.sort((l1, l2) -> {
            for (int idx = 0; idx < l1.size(); ++idx) {
                int c = ObjectUtils.compare(l1.get(idx), l2.get(idx));
                if (c != 0) {
                    return c;
                }
            }
            return 0;
        });

        return permutations;
    }
}
