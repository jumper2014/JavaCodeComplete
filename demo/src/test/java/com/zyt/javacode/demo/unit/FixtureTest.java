package com.zyt.javacode.demo.unit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// @BeforeAll和@AfterAll也只能标注在静态方法上。
public class FixtureTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
        System.out.println("setUp");
    }

    @AfterEach
    public void tearDown() {
        this.calculator = null;
        System.out.println("tearDown");
    }

    @BeforeAll
    public static void initDatabase() {
        System.out.println("initDatabase");
    }

    @AfterAll
    public static void dropDatabase() {
        System.out.println("dropDatabase");
    }

    @Test
    void testAdd() {
        assertEquals(100, this.calculator.add(100));
        assertEquals(150, this.calculator.add(50));
        assertEquals(130, this.calculator.add(-20));
    }

    @Test
    void testSub() {
        assertEquals(-100, this.calculator.sub(100));
        assertEquals(-150, this.calculator.sub(50));
        assertEquals(-130, this.calculator.sub(-20));
    }
}


class Calculator {
    private long n = 0;

    public long add(long x) {
        n = n + x;
        return n;
    }

    public long sub(long x) {
        n = n - x;
        return n;
    }
}