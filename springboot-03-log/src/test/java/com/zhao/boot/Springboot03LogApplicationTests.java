package com.zhao.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LogApplicationTests {

    /**
     * ERROR > WARN > INFO > DEBUG > TRACE
     */
    @Test
    public void contextLoads() {
        Logger logger = LoggerFactory.getLogger(getClass());
        System.out.println("------------日志-----------");
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
        logger.trace("trace");
        logger.warn("warn");

        //printMethodStack();
    }

    private void printMethodStack() {
        StackTraceElement stack[] = (new Throwable()).getStackTrace();
        for (int i = 0; i < stack.length; i++) {
            StackTraceElement s = stack[i];
            System.out.format(" ClassName:%d\t%s\n", i, s.getClassName());
            System.out.format("MethodName:%d\t%s\n", i, s.getMethodName());
            System.out.format("  FileName:%d\t%s\n", i, s.getFileName());
            System.out.format("LineNumber:%d\t%s\n\n", i, s.getLineNumber());
        }
    }

}