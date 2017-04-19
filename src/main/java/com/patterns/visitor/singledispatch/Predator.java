package com.patterns.visitor.singledispatch;

public class Predator {

    public void eats(Prey prey) {
        System.out.println("Predator eats Prey");
    }

    public void eats(Sheep sheep) {
        System.out.println("Predator eats Sheep");
    }
}

