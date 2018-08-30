package ru.job4j.task_009;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тесты анализатора строк на уникальность символов.
 *
 * @author job4j
 * @since 28.07.2016
 */
public class UniqueCharsTest {
    /**
     * В строке "1" один уникальный символ: "1".
     */
    @Test
    public void whenOneCharThenOneUnique() {
        UniqueChars unique = new UniqueChars("1");
        int result = unique.unique();
        assertThat(result, is(1));
    }

    /**
     * В строке "2+2" два уникальных символа: "2" и "+".
     */
    @Test
    public void hasNotUnique() {
        UniqueChars unique = new UniqueChars("2+2");
        int result = unique.unique();
        assertThat(result, is(2));
    }

    /**
     * В строке "123" все три символа уникальны.
     */
    @Test
    public void onlyUnique() {
        UniqueChars unique = new UniqueChars("123");
        int result = unique.unique();
        assertThat(result, is(3));
    }

    /**
     * В строке "1111" один уникальный символ: "1".
     */
    @Test
    public void onlyDublicate() {
        UniqueChars unique = new UniqueChars("1111");
        int result = unique.unique();
        assertThat(result, is(1));
    }
}
