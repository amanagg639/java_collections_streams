package basic;

import basic.PerformanceTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTest {

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void testLongRunningTask(){
        Assertions.assertEquals("Task Completed", PerformanceTesting.longRunningTask());
    }
}
