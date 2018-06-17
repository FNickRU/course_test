package ru.parsentev.task_014;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Тесты разворота предложений по словам.
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ReversePhraseTest {
    /**
     * "code and earn" -> "earn and code".
     */
    @Test
    public void oneWords() {
        ReversePhrase phrase = new ReversePhrase("code and earn");
        String result = phrase.reverse();
        assertThat(result, is("earn and code"));
    }

    /**
     * "Java" -> "Java".
     */
    @Test
    public void oneWord() {
        ReversePhrase phrase = new ReversePhrase("Java");
        String result = phrase.reverse();
        assertThat(result, is("Java"));
    }
}
