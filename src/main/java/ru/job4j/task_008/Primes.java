package ru.job4j.task_008;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, вычисляющий все простые числа до N.
 * Используемый метод - оптимизированное решето Эратосфена.
 *
 * @author fnickru
 * @since 15.06.2018
 */
public final class Primes {
    /**
     * Предел вычисляемого диапазона простых чисел.
     */
    private final int limit;

    /**
     * Конструктор с параметром.
     * @param limit - предел вычисляемого диапазона простых чисел
     */
    public Primes(final int limit) {
        this.limit = limit;
    }

    /**
     * Функция нахождения простых чисел решетом Эратосфена.
     * @return все простые числа до N
     */
    public List<Integer> calc() {
        List<Integer> primes = new ArrayList<>();

        for (int num = 2; num <= limit; ++num) {
            primes.add(num);
        }

        for (int idx = 0; idx < primes.size(); ++idx) {
            int prime = primes.get(idx);
            for (int comp = prime * prime; comp <= limit; comp += prime) {
                primes.remove(Integer.valueOf(comp));
            }
        }

        return primes;
    }
}
