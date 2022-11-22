package com.benchmark.kotlinspring

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("/v1/benchmark")
    suspend fun getHelloSleep(@RequestParam delay: Long): String {
        delay(delay)
        return "";
    }
}