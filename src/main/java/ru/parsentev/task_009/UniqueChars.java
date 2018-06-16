package ru.parsentev.task_009;

/**
 * Класс, подсчитывающий количество уникальных символов в данной строке.
 *
 * @author fnickru
 * @since 16.06.2018
 */
public class UniqueChars {
    /**
     * Анализируемая строка.
     */
    private final String line;

    /**
     * Конструктор с параметром.
     * @param line - анализируемая строка
     */
    public UniqueChars(final String line) {
        this.line = line;
    }

    /**
     * Метод подсчета уникальных символов в строке.
     * @return количество уникальных символов в строке
     */
    public int unique() {
        StringBuilder uniques = new StringBuilder();

        for (int i = 0; i < line.length(); ++i) {
            char symbol = line.charAt(i);
            if (uniques.toString().indexOf(symbol) < 0) {
                uniques.append(symbol);
            }
        }

        return uniques.length();
    }
}
