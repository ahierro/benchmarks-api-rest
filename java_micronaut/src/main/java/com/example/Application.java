package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.runtime.Micronaut;
import io.reactivex.rxjava3.core.Single;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}

@Controller("/v1/benchmark")
class EchoController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public Single<String> echoAsync(@QueryValue("delay") Long delay) {
        return Single.just("").delay(delay, TimeUnit.MILLISECONDS);
    }
}