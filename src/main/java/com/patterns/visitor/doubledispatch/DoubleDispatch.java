package com.patterns.visitor.doubledispatch;



public class DoubleDispatch {

    public static void main(String[] args) {

        Predator lionPredator = new Lion();
        lionPredator.accept(new SheepVisitor());
        lionPredator.accept(new GoatVisitor());
    }
}
