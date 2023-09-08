package org.example.PatternMediator;

public class Mediator {
    public static void injectEngine(Car car, Engine engine){
        car.setEngine(engine);
    }
}
