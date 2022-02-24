package com.sagar.reativejava.controllers

import com.github.javafaker.Faker
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/getData")
class StreamFirst {

    @GetMapping
    fun getData(): Mono<String> {
        return Mono.just(Faker.instance().animal().name())
    }
}