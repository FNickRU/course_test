package ru.parsentev.task_008;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;

import org.junit.Test;
import java.util.List;

/**
 * Тест класса, ищущего все простые числа до N.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class PrimesTest {
    /**
     * Простые числа до 3-х: 2 и 3.
     */
    @Test
    public void calc() {
        Primes primes = new Primes(3);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3)));
    }
}
