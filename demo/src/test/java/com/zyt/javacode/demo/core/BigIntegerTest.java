package com.zyt.javacode.demo.core;

import java.math.BigInteger;

/*
BigInteger用于表示任意大小的整数；
BigInteger是不变类，并且继承自Number；
将BigInteger转换成基本类型时可使用longValueExact()等方法保证结果准确。
 */
public class BigIntegerTest {

    public static void main(String[] args) {
        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
    }
}