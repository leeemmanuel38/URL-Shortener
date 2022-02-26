package org.example.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class ExampleVerticle extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) {
        /* start the HTTP server
         * requestHandler() method is called every time the server receives a request
         */
        vertx.createHttpServer()
                .requestHandler(r -> r.response().end("Welcome to Vert.x")).listen(config().getInteger("http.port", 9090), result -> {
            if (result.succeeded()) {
                startFuture.complete();
            } else {
                startFuture.fail(result.cause());
            }
        });
    }

    @Override
    public void stop(){
        System.out.println("Shutting down app");
    }
}
