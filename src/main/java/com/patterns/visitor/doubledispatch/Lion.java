package com.patterns.visitor.doubledispatch;


public class Lion extends Predator {

    public void accept(PreyVisitor visitor) {
        visitor.visitFromLionPredator(this);
    }

    public void eats(Prey prey) {
        System.out.println("Lion eats Prey");
    }

    public void eats(Sheep sheep) {
        System.out.println("Lion eats Sheep");
    }

    public void eats(Goat goat) {
        System.out.println("Lion eats Goat");
    }
}
