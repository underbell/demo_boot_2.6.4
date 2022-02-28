package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;

@DataR2dbcTest
class DemoRepositoryTest {

    @Autowired
    private DemoRepository demoRepository;

    @Test
    void create() {
        Demo demo = demoRepository.findByIdAndUseYnIsTrue(1L).block();

        Assertions.assertNotNull(demo);
    }
}