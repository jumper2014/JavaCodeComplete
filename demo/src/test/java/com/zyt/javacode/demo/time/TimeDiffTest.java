package com.zyt.javacode.demo.time;

import java.util.concurrent.TimeUnit;

public class TimeDiffTest {

    public static void main(String[] args) throws InterruptedException {
        final long startMs = TimeUtils.nowMs();

        TimeUnit.SECONDS.sleep(5); // 模拟业务代码

        System.out.println("timeCost: " + TimeUtils.diffMs(startMs));
    }
}
