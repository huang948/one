package com.sample.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.CacheEvict;

@SpringBootTest
@CacheEvict(allEntries = true)
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
