package com.gen.app;

import com.gen.core.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@ComponentScan(basePackages = {"com.gen.app", "com.gen.core"})
public class GenAppTest {
    @Autowired
    private ExampleService es;

    @Test
    public void testRun() {
        log.info("================= 测试代码 start===============");
        System.out.printf("调用:%s %n", es.getById(1));
        log.info("================= 测试代码 end===============");
    }
}
