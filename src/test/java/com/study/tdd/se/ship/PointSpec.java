package com.study.tdd.se.ship;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class PointSpec {

    private Point point;
    private final int x = 12;
    private final int y = 21;

    @BeforeMethod
    public void beforeTest() {
        point = new Point(x, y);
    }

    public void whenInstantiatedThenXIsSet() {
        assertEquals(point.getX(), x);
    }

    public void whenInstantiatedThenYIsSet() {
        assertEquals(point.getY(), y);
    }

}
