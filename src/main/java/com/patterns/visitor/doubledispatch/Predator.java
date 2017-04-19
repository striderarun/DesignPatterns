package com.patterns.visitor.doubledispatch;


public class Predator {

    public void accept(PreyVisitor visitor) {
        System.out.println("Do nothing here");
    }

    public void eats(Prey prey) {
        System.out.println("Predator eats Prey");
    }

    public void eats(Sheep sheep) {
        System.out.println("Predator eats Sheep");
    }

    public void eats(Goat goat) {
        System.out.println("Predator eats Goat");
    }

}

