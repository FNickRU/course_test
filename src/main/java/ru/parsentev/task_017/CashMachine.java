package ru.parsentev.task_017;

import static java.lang.Integer.signum;
import static java.util.Arrays.sort;
import static java.util.Collections.singletonList;
import static org.apache.commons.lang3.ArrayUtils.reverse;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс машины для размена бумажной купюры на монеты.
 *
 * @author fnickru
 * @since 22.06.2018
 */
public final class CashMachine {
    /**
     * Номиналы монет в разменной машине.
     */
    private final int[] values;

    /**
     * Конструктор с параметром.
     * @param values - номиналы монет, доступных в машине
     */
    public CashMachine(final int[] values) {
        this.values = values;
        sort(this.values);
        reverse(this.values);
    }

    /**
     * Метод размена банкноты на монеты.
     * @param note - номинал банкноты, которую нужно разменять
     * @return все варианты размена банкноты
     */
    public List<List<Integer>> exchange(final int note) {
        return exchange(note, 0);
    }

    /**
     * Метод размена остатка банкноты на монеты, при ограничении в максимальный номинал монет.
     * @param residue - остаток, который необходимо разменять
     * @param maxCoinIdx - индекс монеты с максимальным номиналом
     * @return все варинты размена остатка
     */
    public List<List<Integer>> exchange(final int residue,
                                        final int maxCoinIdx) {
        List<List<Integer>> variations = new LinkedList<>();

        for (int idx = maxCoinIdx; idx < values.length; ++idx) {
            int value = values[idx];
            Integer change = residue - values[idx];
            switch (signum(change.compareTo(0))) {
                case -1:
                    break;
                case 0:
                    variations.add(new LinkedList<>(singletonList(value)));
                    break;
                case 1:
                    for (List<Integer> variation : exchange(change, idx)) {
                        if (!variation.isEmpty()) {
                            variation.add(0, value);
                            variations.add(variation);
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }

        return variations;
    }
}
