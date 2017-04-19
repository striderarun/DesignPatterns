package com.patterns.visitor.doubledispatch;


public class SheepVisitor implements PreyVisitor {

    @Override
    public void visitFromLionPredator(Lion predator) {
        predator.eats(new Sheep());
    }
}
