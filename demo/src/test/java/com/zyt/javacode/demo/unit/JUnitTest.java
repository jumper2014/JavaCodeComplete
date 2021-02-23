package com.zyt.javacode.demo.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTest {
    @Test
    void testFact() {
        assertEquals(1, Factorial.fact(1));
        assertEquals(2, Factorial.fact(2));
        assertEquals(6, Factorial.fact(3));
        assertEquals(3628800-1, Factorial.fact(10));
        assertEquals(2432902008176640000L, Factorial.fact(20));
    }
}

// 可以有多个类，但最多只能有一个被public修饰的class。
// private和protected只会用来修饰类的属性，方法和内部类。
// 你想如果外部类是private的，其他任何的类都无法访问这个类，那么这个类就没有任何意义了
class Factorial {
    public static long fact(long n) {
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
