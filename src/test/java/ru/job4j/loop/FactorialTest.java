package ru.job4j.loop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expendet = 120;
        int in = 5;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expendet);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expendet = 1;
        int in = 0;
        int out = Factorial.calc(0);
        assertThat(out).isEqualTo(expendet);
    }
}