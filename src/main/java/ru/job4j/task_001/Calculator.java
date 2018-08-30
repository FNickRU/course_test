package ru.job4j.task_001;

import static java.lang.Math.pow;

/**
 * Калькулятор, поддерживающий 5 базовых операций:
 * сложение, вычитание, умножение, деление и возведение в степень.
 *
 * @author fnickru
 * @since 03.06.2018
 */
public final class Calculator {
    /**
     * Результат последней операции.
     */
    private double result = 0;

    /**
     * Возвращает результат последней операции.
     * @return result
     */
    public double getResult() {
        return result;
    }

    /**
     * Операция суммы.
     * @param first - первый операнд
     * @param second - второй операнд
     */
    public void add(final double first, final double second) {
        result = first + second;
    }

    /**
     * Операция разности.
     * @param first - первый операнд
     * @param second - второй операнд
     */
    public void subtract(final double first, final double second) {
        result = first - second;
    }

    /**
     * Операция произведения.
     * @param first - первый операнд
     * @param second - второй операнд
     */
    public void multiple(final double first, final double second) {
        result = first * second;
    }

    /**
     * Операция деления.
     * @param first - первый операнд
     * @param second - второй операнд
     * @throws IllegalStateException - если second = 0
     */
    public void divide(final double first, final double second) {
        if (second == 0d) {
            throw new IllegalStateException("Div by Zero");
        }
        result = first / second;
    }

    /**
     * Операция возведения в степень.
     * @param first - первый операнд
     * @param second - второй операнд
     */
    public void expand(final double first, final double second) {
        result = pow(first, second);
    }
}
