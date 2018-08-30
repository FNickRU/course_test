package ru.job4j.task_014;

/**
 * Класс для "разворота" предложений по словам в обратном порядке.
 *
 * @author fnickru
 * @since 17.06.2018
 */
public final class ReversePhrase {
    /**
     * Разворачиваемая строка.
     */
    private final String line;

    /**
     * Конструктор с параметром.
     * @param line - разворачиваемая строка
     */
    public ReversePhrase(final String line) {
        this.line = line;
    }

    /**
     * Метод для "разворота" предложений по словам.
     * @return перевернутую строку.
     */
    public String reverse() {
        String[] words = line.split("\\s");
        StringBuilder reverse = new StringBuilder();

        for (int idx = words.length - 1; idx >= 0; --idx) {
            reverse.append(words[idx]).append(' ');
        }

        return reverse.toString().trim();
    }
}
