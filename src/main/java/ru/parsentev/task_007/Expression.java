package ru.parsentev.task_007;

import ru.parsentev.task_001.Calculator;

/**
 * Класс - парсер математических выражений.
 *
 * @author fnickru
 * @since 12.06.2018
 */
public class Expression {
    /**
     * Размер допустимого выражения.
     * Пример: 2+2 - допустимо, 2+2-3 - нет.
     */
    public static final int EXPRESSION_SIZE = 3;

    /**
     * Вычисляемое выражение.
     */
    private final String expr;
    /**
     * Калькулятор, производящий вычисления.
     */
    private final Calculator calculator;

    /**
     * Конструктор с параметром.
     * @param expr - вычисляемое выражение
     */
    public Expression(final String expr) {
        this.expr = expr;
        calculator = new Calculator();
    }

    /**
     * Метод, производящие разбор и вычисляющий выражение.
     * @return результат выражения
     */
    public double calc() {
        String[] values = expr.split("([+-/*])");

        if (values.length == EXPRESSION_SIZE) {
            double first = Double.valueOf(values[0]);
            double second = Double.valueOf(values[2]);

            switch (values[1]) {
                case "+":
                    calculator.add(first, second);
                    break;
                case "-":
                    calculator.subtract(first, second);
                    break;
                case "*":
                    calculator.multiple(first, second);
                    break;
                case "/":
                    calculator.divide(first, second);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        } else {
            throw new IllegalStateException();
        }

        return calculator.getResult();
    }
}
