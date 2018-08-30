package ru.job4j.task_010;

import static org.apache.commons.lang3.StringUtils.countMatches;

/**
 * Класс, проверяющий корректность расставления скобок в строке.
 *
 * @author fnickru
 * @since 16.06.2018
 */
public final class Brackets {
    /**
     * Анализируемая строка.
     */
    private final String line;

    /**
     * Конструктор с параметром.
     * @param line - анализируемая строка
     */
    public Brackets(final String line) {
        this.line = line;
    }

    /**
     * Метод проверки скобок в строке на корректность.
     * @return true - если скобки в строке расставлены правильно, false - иначе.
     */
    public boolean isCorrect() {
        return countMatches(line, '(') == countMatches(line, ')');
    }
}
