package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to00then2() {
        double expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to00then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to00to00then2() {
        double expected = 2;
        Point c = new Point(0, 2, 0);
        Point d = new Point(0, 0, 0);
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);
    }
}