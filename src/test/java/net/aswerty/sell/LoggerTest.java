package net.aswerty.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PowerSun
 * @date 2017/11/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Test
    public void test1() throws Exception {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
