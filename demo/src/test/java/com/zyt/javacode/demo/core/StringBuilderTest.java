package com.zyt.javacode.demo.core;

public class StringBuilderTest {
    public static void main(String[] args) {
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
    }
}
