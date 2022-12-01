package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

    public class FindLoopTest {
        @Test
        public void whenArrayHas5Then0() {
            int[] data = new int[] {5, 10, 3};
            int el = 5;
            int result = FindLoop.indexOf(data, el);
            int expected = 0;
            assertThat(result).isEqualTo(expected);
        }

        @Test
        public void whenArrayHasNot33ThenMinus1() {
            int[] data = new int[] {1, 7, 12, 34, 50};
            int el = 33;
            int result = FindLoop.indexOf(data, el);
            int expected = -1;
            assertThat(result).isEqualTo(expected);
        }

        @Test
        public void whenArrayHas61Then2() {
            int[] data = new int[] {2, 4, 61, 54, 22};
            int el = 61;
            int result = FindLoop.indexOf(data, el);
            int expected = 2;
            assertThat(result).isEqualTo(expected);
        }
    }