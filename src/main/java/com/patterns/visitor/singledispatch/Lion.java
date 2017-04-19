package com.patterns.visitor.singledispatch;


public class Lion extends Predator {

    public void eats(Prey prey) {
        System.out.println("Lion eats Prey");
    }

    public void eats(Sheep sheep) {
        System.out.println("Lion eats Sheep");
    }
}
