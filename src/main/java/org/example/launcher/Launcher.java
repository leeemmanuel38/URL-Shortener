package org.example.launcher;

import io.vertx.core.Vertx;
import org.example.verticles.ExampleVerticle;

public class Launcher {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new ExampleVerticle());
    }
}
