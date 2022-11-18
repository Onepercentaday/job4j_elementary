package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when11To12Then12() {
        int left = 11;
        int right = 12;
        int expected = 12;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when15To10Then15() {
        int left = 15;
        int right = 10;
        int expected = 15;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5To5Then5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}