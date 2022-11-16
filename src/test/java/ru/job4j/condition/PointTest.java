package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when23To02Then2dot23() {
        double expected = 2.23;
        int x1 = 2;
        int y1 = 3;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when57To912Then6dot40() {
        double expected = 6.40;
        int x1 = 5;
        int y1 = 7;
        int x2 = 9;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when1232To1115Then17dot03() {
        double expected = 6.40;
        int x1 = 5;
        int y1 = 7;
        int x2 = 9;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}