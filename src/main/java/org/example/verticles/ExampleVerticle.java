package org.example.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class ExampleVerticle extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) {
        System.out.println("Welcome to Vertx");
    }
}
