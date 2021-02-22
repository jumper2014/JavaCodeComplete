package com.zyt.javacode.demo.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
使用Java标准库内置的Logging有以下局限：
Logging系统在JVM启动时读取配置文件并完成初始化，一旦开始运行main()方法，就无法修改配置；
配置不太方便，需要在JVM启动时传递参数-Djava.util.logging.config.file=<config-file-name>。
 */
public class JdkLoggingTest {

    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }

}
