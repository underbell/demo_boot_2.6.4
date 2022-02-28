package com.example.demo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface DemoRepository extends R2dbcRepository<Demo, Long> {
    Mono<Demo> findByIdAndUseYnIsTrue(Long id);
}
