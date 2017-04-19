package com.patterns.visitor.doubledispatch;


public class GoatVisitor implements PreyVisitor {

    @Override
    public void visitFromLionPredator(Lion predator) {
        predator.eats(new Goat());
    }
}
