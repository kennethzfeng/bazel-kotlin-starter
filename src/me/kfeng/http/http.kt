@file:JvmName("Main")
package me.kfeng.http

import io.undertow.Undertow.Builder
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

fun index(exchange: HttpServerExchange) {
    val msg = "Hello, World!"
    exchange.getResponseSender().send(msg)
}

fun main(args: Array<String>) {
    val PORT = 8080
    val HOST = "localhost"
    var builder = io.undertow.Undertow.builder()
    builder = builder.addHttpListener(PORT, HOST)
    builder.setHandler(::index)
    val server = builder.build()

    println("Listening on $HOST:$PORT")
    server.start()
}
