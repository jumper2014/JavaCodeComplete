package com.zyt.javacode.demo.unit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
    @Test
    void testNegative1() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Factor.fact(-1);
            }
        });
    }

    @Test
    void testNegative2() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factor.fact(-1);
        });
    }

}


class Factor {
    public static long fact(long n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}