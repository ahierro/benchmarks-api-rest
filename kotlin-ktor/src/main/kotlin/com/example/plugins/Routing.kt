package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.util.*
import kotlinx.coroutines.delay

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/v1/benchmark") {
            delay(call.request.queryParameters["delay"]?.toLong()?:0)
            call.respond("")
        }
    }
    routing {
    }
}
