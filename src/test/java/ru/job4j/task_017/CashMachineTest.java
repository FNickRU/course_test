package ru.job4j.task_017;

import static java.util.Arrays.asList;
import static java.util.Collections.list;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import java.util.List;

/**
 * Тест машины по размену купюр на монеты.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class CashMachineTest {
    /**
     * Если в машине монеты [1, 5, 10],
     * а на размен подается купюра [1],
     * то единственный вариант размена - [1].
     */
    @Test
    public void unchange() {
        CashMachine machine = new CashMachine(new int[] {1, 5, 10});
        List<List<Integer>> result = machine.exchange(1);
        assertThat(result, is(singletonList(singletonList(1))));
    }

    /**
     * Если в машине монеты [1, 5, 10],
     * а на размен подается купюра [10],
     * то варианты размена:
     * [10], [5, 5], [5, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1, 1, 1, 1, 1].
     */
    @Test
    public void five() {
        CashMachine machine = new CashMachine(new int[] {1, 5, 10});
        List<List<Integer>> result = machine.exchange(5);
        assertThat(result, is(
                asList(
                        asList(1, 1, 1, 1, 1),
                        asList(5)
                )
        ));
    }

    @Test
    public void change() {
        CashMachine machine = new CashMachine(new int[] {10, 5, 1});
        List<List<Integer>> result = machine.exchange(10);
        assertThat(
                result, is(
                        asList(
                                singletonList(10),
                                asList(5, 5),
                                asList(1, 1, 1, 1, 1, 5),
                                asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
                        )
                )
        );
    }
}
